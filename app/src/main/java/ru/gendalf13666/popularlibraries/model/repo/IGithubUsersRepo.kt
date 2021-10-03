package ru.gendalf13666.popularlibraries.model.repo

import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import ru.gendalf13666.popularlibraries.model.entity.GithubUser
import ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo

interface IGithubUsersRepo {
    fun getUsers(): Observable<List<GithubUser>>
    fun getUserByLogin(login: String?): Maybe<GithubUser>
    fun getUserRepos(url: String): Maybe<List<GithubUserRepo>>
}
