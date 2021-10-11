package ru.gendalf13666.popularlibraries.baselogic.users

import com.github.terrakok.cicerone.Router
import io.reactivex.rxjava3.kotlin.plusAssign
import ru.gendalf13666.popularlibraries.baselogic.BasePresenter
import ru.gendalf13666.popularlibraries.data.entity.GithubUser
import ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository
import ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers
import ru.gendalf13666.popularlibraries.helpers.screens.UserScreen

class UsersPresenter constructor(
    private val userRepository: GithubUsersRepository,
    private val appSchedulers: AppSchedulers,
    router: Router
) : BasePresenter<UsersView>(router) {

    class UsersUserListPresenter : UsersListPresenter {
        val users = mutableListOf<GithubUser>()

        override var itemClickListener: ((UserItemView) -> Unit)? = null

        override fun getCount() = users.size

        override fun bindView(view: UserItemView) {
            val user = users[view.currentPosition]
            view.setLogin(user.login)
            view.setAvatar(user)
        }
    }

    val usersListPresenter = UsersUserListPresenter()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()
        loadData()
    }

    private fun loadData() {
        disposables +=
            userRepository
                .getUsers()
                .observeOn(appSchedulers.main())
                .subscribeOn(appSchedulers.background())
                .subscribe(
                    { gitHubUsers ->
                        usersListPresenter.users.addAll(gitHubUsers)
                        viewState.updateList()
                    },
                    { exception -> viewState.showException(exception) }
                )
        usersListPresenter.itemClickListener = {
            val userLogin = usersListPresenter.users[it.currentPosition].login
            router.navigateTo(UserScreen(userLogin))
        }
    }
}
