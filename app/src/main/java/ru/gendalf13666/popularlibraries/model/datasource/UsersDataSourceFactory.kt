package ru.gendalf13666.popularlibraries.model.datasource

import ru.gendalf13666.popularlibraries.model.api.GithubApiFactory

object UsersDataSourceFactory {
    fun create() = UsersDataSourceImpl(GithubApiFactory.create())
}
