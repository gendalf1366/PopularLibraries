package ru.gendalf13666.popularlibraries.baselogic.users

import ru.gendalf13666.popularlibraries.data.entity.GithubUser

interface UserItemView {
    var currentPosition: Int

    fun setLogin(text: String)

    fun setAvatar(user: GithubUser)
}
