package ru.gendalf13666.popularlibraries.baselogic.user

import android.graphics.drawable.Drawable
import com.bumptech.glide.RequestBuilder
import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState
import ru.gendalf13666.popularlibraries.baselogic.ExceptionView
import ru.gendalf13666.popularlibraries.data.entity.GithubUser

@SingleState
interface UserView : MvpView, ExceptionView {

    fun init()

    fun showUser(user: GithubUser, requestBuilder: RequestBuilder<Drawable>)

    fun updateRepositoryList()
}
