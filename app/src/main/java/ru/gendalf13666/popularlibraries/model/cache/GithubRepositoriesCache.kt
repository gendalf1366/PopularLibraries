package ru.gendalf13666.popularlibraries.model.cache

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.model.GitHubRepo
import ru.gendalf13666.popularlibraries.model.GithubUser

interface GithubRepositoriesCache {
    fun getUserRepos(user: GithubUser): Single<List<GitHubRepo>>
    fun putUserRepos(user: GithubUser, repos: List<GitHubRepo>): Completable
}
