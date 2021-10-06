package ru.gendalf13666.popularlibraries.presenter

import com.github.terrakok.cicerone.Router
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.disposables.CompositeDisposable
import moxy.MvpPresenter
import ru.gendalf13666.popularlibraries.model.GithubUser
import ru.gendalf13666.popularlibraries.model.IGithubUsersRepo
import ru.gendalf13666.popularlibraries.view.UserItemView
import ru.gendalf13666.popularlibraries.view.UsersView

class UsersPresenter(
    private val usersRepo: IGithubUsersRepo,
    private val router: Router,
    private val uiSched: Scheduler
) : MvpPresenter<UsersView>() {

    class UsersListPresenter : IUserListPresenter {
        val users = mutableListOf<GithubUser>()
        override var itemClickListener: ((UserItemView) -> Unit)? = null

        override fun bindView(view: UserItemView) {
            val user = users[view.pos]
            user.login?.let { view.setLogin(it) }
            user.avatarUrl?.let { view.loadAvatar(it) }
        }

        override fun getCount() = users.size
    }

    val usersListPresenter = UsersListPresenter()
    private var disposable: CompositeDisposable = CompositeDisposable()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()
        loadData()
        usersListPresenter.itemClickListener = { itemView ->
            val user = usersListPresenter.users[itemView.pos]
            router.navigateTo(AndroidScreens.UserScreen(user).getFragment())
        }
    }

    private fun loadData() {
        disposable.add(
            usersRepo.getUsers()
                .observeOn(uiSched)
                .subscribe({ users -> subscribeUsers(users) }, { it.printStackTrace() })
        )
    }

    private fun subscribeUsers(users: List<GithubUser>) {
        usersListPresenter.users.clear()
        usersListPresenter.users.addAll(users)
        viewState.updateList()
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }

    override fun onDestroy() {
        disposable.dispose()
        super.onDestroy()
    }
}
