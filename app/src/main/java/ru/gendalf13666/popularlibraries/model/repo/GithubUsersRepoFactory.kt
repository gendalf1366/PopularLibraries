package ru.gendalf13666.popularlibraries.model.repo

import ru.gendalf13666.popularlibraries.model.datasource.CacheUsersDataSourceFactory
import ru.gendalf13666.popularlibraries.model.datasource.UsersDataSourceFactory

object GithubUsersRepoFactory {
    fun create(): IGithubUsersRepo = GithubUsersRepo(
        UsersDataSourceFactory.create(),
        CacheUsersDataSourceFactory.create()
    )
}
