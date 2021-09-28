package ru.gendalf13666.popularlibraries

import ru.gendalf13666.popularlibraries.model.GithubUser
import ru.gendalf13666.popularlibraries.presenter.IScreens

class AndroidScreens : IScreens {
    override fun users() = UsersScreen()

    override fun user(user: GithubUser) = UserScreen(user)
}
