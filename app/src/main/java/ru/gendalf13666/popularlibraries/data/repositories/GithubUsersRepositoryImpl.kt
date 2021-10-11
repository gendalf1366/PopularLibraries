package ru.gendalf13666.popularlibraries.data.repositories

import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.api.GithubApi
import ru.gendalf13666.popularlibraries.data.db.cache.GithubCache
import ru.gendalf13666.popularlibraries.data.entity.GithubUser
import ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository
import ru.gendalf13666.popularlibraries.helpers.NetworkStatus
import javax.inject.Inject

class GithubUsersRepositoryImpl @Inject constructor(
    private val githubApi: GithubApi,
    private val githubCache: GithubCache,
    private val networkStatus: NetworkStatus
) : GithubUsersRepository {
    override fun getUsers(): Single<List<GithubUser>> =
        networkStatus
            .isOnlineSingle()
            .flatMap { internetEnable ->
                if (internetEnable) {
                    githubApi
                        .getUsers()
                        .flattenAsObservable { users ->
                            githubCache.insertUsers(users = users)
                            return@flattenAsObservable users
                        }
                        .toList()
                } else {
                    githubCache.getUsers()
                }
            }

    override fun getUser(userLogin: String): Single<GithubUser> =
        networkStatus
            .isOnlineSingle()
            .flatMap { internetEnable ->
                if (internetEnable) {
                    githubApi
                        .getUser(userLogin)
                        .map { user ->
                            githubCache.insertUsers(users = listOf(user))
                            return@map user
                        }
                } else {
                    githubCache.getUser(userLogin)
                }
            }

    override fun getRepositories(login: String): Single<List<GithubUserRepository>> =
        networkStatus
            .isOnlineSingle()
            .flatMap { internetEnable ->
                if (internetEnable) {
                    githubApi
                        .getRepositories(login)
                        .map { users ->
                            users.forEach { user -> user.userId = user.owner?.userId ?: 0 }
                            return@map users
                        }
                        .flattenAsObservable { repositories ->
                            githubCache.insertRepositories(repositories)
                            return@flattenAsObservable repositories
                        }
                        .toList()
                } else {
                    githubCache.getRepositoriesOnUserLogin(login)
                }
            }

    override fun getRepository(login: String, repositoryName: String): Single<GithubUserRepository> =
        networkStatus
            .isOnlineSingle()
            .flatMap { internetEnable ->
                if (internetEnable) {
                    githubApi
                        .getRepository(login, repositoryName)
                        .map { user ->
                            user.userId = user.owner?.userId ?: 0
                            githubCache.insertRepository(user)
                            return@map user
                        }
                } else {
                    githubCache.getRepositoryOnUserLogin(login, repositoryName)
                }
            }
}
