package ru.gendalf13666.popularlibraries.helpers.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/di/modules/UserModule;", "", "bindGithubCache", "Lru/gendalf13666/popularlibraries/data/db/cache/GithubCache;", "githubCache", "Lru/gendalf13666/popularlibraries/data/db/cache/GithubCacheImpl;", "bindGithubUsersRepository", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "repository", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepositoryImpl;", "bindNetworkStatus", "Lru/gendalf13666/popularlibraries/helpers/NetworkStatus;", "networkStatus", "Lru/gendalf13666/popularlibraries/helpers/NetworkStatusImpl;", "bindUserAvatarRepository", "Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepository;", "userAvatarRepository", "Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract interface UserModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository bindGithubUsersRepository(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepositoryImpl repository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract ru.gendalf13666.popularlibraries.data.db.cache.GithubCache bindGithubCache(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.db.cache.GithubCacheImpl githubCache);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract ru.gendalf13666.popularlibraries.helpers.NetworkStatus bindNetworkStatus(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.helpers.NetworkStatusImpl networkStatus);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepository bindUserAvatarRepository(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepositoryImpl userAvatarRepository);
}