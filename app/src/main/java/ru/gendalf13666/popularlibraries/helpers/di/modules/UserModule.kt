package ru.gendalf13666.popularlibraries.helpers.di.modules

import dagger.Binds
import dagger.Module
import ru.gendalf13666.popularlibraries.data.db.cache.GithubCache
import ru.gendalf13666.popularlibraries.data.db.cache.GithubCacheImpl
import ru.gendalf13666.popularlibraries.data.repositories.*
import ru.gendalf13666.popularlibraries.helpers.NetworkStatus
import ru.gendalf13666.popularlibraries.helpers.NetworkStatusImpl
import javax.inject.Singleton

@Module
interface UserModule {

    @Singleton
    @Binds
    fun bindGithubUsersRepository(repository: GithubUsersRepositoryImpl): GithubUsersRepository

    @Singleton
    @Binds
    fun bindGithubCache(githubCache: GithubCacheImpl): GithubCache

    @Singleton
    @Binds
    fun bindNetworkStatus(networkStatus: NetworkStatusImpl): NetworkStatus

    @Singleton
    @Binds
    fun bindUserAvatarRepository(userAvatarRepository: UserAvatarRepositoryImpl): UserAvatarRepository
}
