package ru.gendalf13666.popularlibraries.data.repositories

import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.data.entity.GithubUser
import ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository

interface GithubUsersRepository {
    fun getUsers(): Single<List<GithubUser>>

    fun getUser(userLogin: String): Single<GithubUser>

    fun getRepositories(login: String): Single<List<GithubUserRepository>>

    fun getRepository(login: String, repositoryName: String): Single<GithubUserRepository>
}
