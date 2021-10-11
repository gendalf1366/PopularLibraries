package ru.gendalf13666.popularlibraries.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepositoryImpl;", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "githubApi", "Lru/gendalf13666/popularlibraries/api/GithubApi;", "githubCache", "Lru/gendalf13666/popularlibraries/data/db/cache/GithubCache;", "networkStatus", "Lru/gendalf13666/popularlibraries/helpers/NetworkStatus;", "(Lru/gendalf13666/popularlibraries/api/GithubApi;Lru/gendalf13666/popularlibraries/data/db/cache/GithubCache;Lru/gendalf13666/popularlibraries/helpers/NetworkStatus;)V", "getRepositories", "Lio/reactivex/rxjava3/core/Single;", "", "Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepository;", "login", "", "getRepository", "repositoryName", "getUser", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "userLogin", "getUsers", "app_debug"})
public final class GithubUsersRepositoryImpl implements ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository {
    private final ru.gendalf13666.popularlibraries.api.GithubApi githubApi = null;
    private final ru.gendalf13666.popularlibraries.data.db.cache.GithubCache githubCache = null;
    private final ru.gendalf13666.popularlibraries.helpers.NetworkStatus networkStatus = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser>> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUser> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository>> getRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> getRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String repositoryName) {
        return null;
    }
    
    @javax.inject.Inject()
    public GithubUsersRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.api.GithubApi githubApi, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.db.cache.GithubCache githubCache, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.helpers.NetworkStatus networkStatus) {
        super();
    }
}