package ru.gendalf13666.popularlibraries.model.datasource

import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.model.entity.GithubUser
import ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo

interface UsersDataSource {

    fun getUsers(): Single<List<GithubUser>>
    fun getUserByLogin(login: String?): Maybe<GithubUser>
    fun getUserRepos(url: String): Maybe<List<GithubUserRepo>>
}
