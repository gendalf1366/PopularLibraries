package ru.gendalf13666.popularlibraries.model.datasource

import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.model.entity.GithubUser

interface CacheUsersDataSource : UsersDataSource {
    fun retain(users: List<GithubUser>): Single<List<GithubUser>>
    fun retain(user: GithubUser): Single<GithubUser>
}
