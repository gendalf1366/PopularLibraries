package ru.gendalf13666.popularlibraries.data.db.cache

import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.data.entity.GithubUser
import ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository

interface GithubCache {

    fun insertUsers(users: List<GithubUser>)

    fun getUsers(): Single<List<GithubUser>>

    fun getUser(userLogin: String): Single<GithubUser>

    fun insertRepository(repository: GithubUserRepository)

    fun insertRepositories(repositories: List<GithubUserRepository>)

    fun getRepositoriesOnUserLogin(userLogin: String): Single<List<GithubUserRepository>>

    fun getRepositoryOnUserLogin(userLogin: String, repositoryName: String): Single<GithubUserRepository>
}
