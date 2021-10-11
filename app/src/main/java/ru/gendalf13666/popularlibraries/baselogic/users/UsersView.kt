package ru.gendalf13666.popularlibraries.baselogic.users

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle
import ru.gendalf13666.popularlibraries.baselogic.ExceptionView

@AddToEndSingle
interface UsersView : MvpView, ExceptionView {

    fun init()

    fun updateList()
}
