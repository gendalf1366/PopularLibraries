package ru.gendalf13666.popularlibraries.model.cache

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.model.GithubUser

interface GithubUsersCache {
    fun getUsers(): Single<List<GithubUser>>
    fun putUsers(users: List<GithubUser>): Completable
}
