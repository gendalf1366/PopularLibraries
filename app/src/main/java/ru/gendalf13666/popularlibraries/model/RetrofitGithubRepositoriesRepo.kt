package ru.gendalf13666.popularlibraries.model

import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import ru.gendalf13666.popularlibraries.model.api.IDataSource
import ru.gendalf13666.popularlibraries.model.cache.GithubRepositoriesCache
import ru.gendalf13666.popularlibraries.model.network.INetworkStatus
import java.lang.RuntimeException

class RetrofitGithubRepositoriesRepo(
    private val api: IDataSource,
    private val networkStatus: INetworkStatus,
    private val githubReposCache: GithubRepositoriesCache
) : IGithubRepositoriesRepo {

    override fun getRepositories(user: GithubUser): Single<List<GitHubRepo>> =
        networkStatus.isOnlineSingle().flatMap { isOnline ->
            if (isOnline) {
                user.reposUrl?.let { url ->
                    api.getRepo(url)
                        .flatMap { repos ->
                            githubReposCache.putUserRepos(user, repos).toSingleDefault(repos)
                        }
                } ?: Single.error<List<GitHubRepo>>(RuntimeException("No user in cache"))
                    .subscribeOn(Schedulers.io())
            } else {
                githubReposCache.getUserRepos(user)
            }
        }.subscribeOn(Schedulers.io())
}
