package ru.gendalf13666.popularlibraries.model

import io.reactivex.rxjava3.core.Single

interface IGithubRepositoriesRepo {
    fun getRepositories(user: GithubUser): Single<List<GitHubRepo>>
}
