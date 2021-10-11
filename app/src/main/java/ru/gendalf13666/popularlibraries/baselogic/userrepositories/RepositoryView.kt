package ru.gendalf13666.popularlibraries.baselogic.userrepositories

import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState
import ru.gendalf13666.popularlibraries.baselogic.ExceptionView

@SingleState
interface RepositoryView : MvpView, ExceptionView {

    fun showInfo(text: String)
}
