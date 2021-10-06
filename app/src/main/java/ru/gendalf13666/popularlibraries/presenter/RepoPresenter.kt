package ru.gendalf13666.popularlibraries.presenter

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import ru.gendalf13666.popularlibraries.model.GitHubRepo
import ru.gendalf13666.popularlibraries.view.RepoView

class RepoPresenter(
    private val router: Router,
    private val gitHubRepo: GitHubRepo
) : MvpPresenter<RepoView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.init()
        viewState.setId(gitHubRepo.id ?: "")
        viewState.setTitle(gitHubRepo.name ?: "")
        viewState.setForksCount((gitHubRepo.forksCount ?: 0).toString())
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }
}
