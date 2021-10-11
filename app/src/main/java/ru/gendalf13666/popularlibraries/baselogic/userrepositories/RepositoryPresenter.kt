package ru.gendalf13666.popularlibraries.baselogic.userrepositories

import com.github.terrakok.cicerone.Router
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.kotlin.plusAssign
import ru.gendalf13666.popularlibraries.baselogic.BasePresenter
import ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository
import ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers
import javax.inject.Inject

class RepositoryPresenter @Inject constructor(
    private val userRepository: GithubUsersRepository,
    private val appSchedulers: AppSchedulers,
    router_: Router,
    private val userLogin: String?,
    private val repositoryName: String?
) : BasePresenter<RepositoryView>(router_) {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        loadData()
    }

    private fun loadData() {
        userLogin?.let { login ->
            repositoryName?.let { repository ->
                disposables += loadRepositoriesInfo(login, repository)
            } ?: viewState.showException(Throwable("Пустое имя репозитория"))
        } ?: viewState.showException(Throwable("Пустой логин пользователя"))
    }

    private fun loadRepositoriesInfo(loin: String, repository: String): Disposable {
        return userRepository
            .getRepository(loin, repository)
            .map { repo ->
                val data = StringBuilder()
                data.append("Имя репозитория: ${repo.name}\n")
                    .append("Полное имя: ${repo.fullName}\n")
                    .append("Кол-во форков: ${repo.countForks}\n")
                    .append("Размер: ${repo.size}\n")
                    .append("Дата создания: ${repo.created}\n")

                data.toString()
            }
            .observeOn(appSchedulers.main())
            .subscribeOn(appSchedulers.background())
            .subscribe(
                { repositoryInfo -> viewState.showInfo(repositoryInfo) },
                { exception -> viewState.showException(exception) }
            )
    }
}
