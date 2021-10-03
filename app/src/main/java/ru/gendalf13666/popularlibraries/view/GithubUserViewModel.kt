package ru.gendalf13666.popularlibraries.view

import ru.gendalf13666.popularlibraries.model.entity.GithubUser

data class GithubUserViewModel(
    val login: String,
    val avatar_url: String,
    val repos_url: String,
) {
    object Mapper {
        fun map(user: GithubUser) = GithubUserViewModel(
            user.login.uppercase(), user.avatar, user.repos_url
        )
    }
}
