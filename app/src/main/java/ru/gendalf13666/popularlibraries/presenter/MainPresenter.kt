package ru.gendalf13666.popularlibraries.presenter

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import ru.gendalf13666.popularlibraries.view.MainView

class MainPresenter(val router: Router) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(AndroidScreens.UsersScreen().getFragment())
    }

    fun backClicked() {
        router.exit()
    }
}
