package ru.gendalf13666.popularlibraries.data.db.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006H\u0016J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/gendalf13666/popularlibraries/data/db/cache/GithubCacheImpl;", "Lru/gendalf13666/popularlibraries/data/db/cache/GithubCache;", "appDB", "Lru/gendalf13666/popularlibraries/data/db/AppDB;", "(Lru/gendalf13666/popularlibraries/data/db/AppDB;)V", "getRepositoriesOnUserLogin", "Lio/reactivex/rxjava3/core/Single;", "", "Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepository;", "userLogin", "", "getRepositoryOnUserLogin", "repositoryName", "getUser", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "getUsers", "insertRepositories", "", "repositories", "insertRepository", "repository", "insertUsers", "users", "app_debug"})
public final class GithubCacheImpl implements ru.gendalf13666.popularlibraries.data.db.cache.GithubCache {
    private final ru.gendalf13666.popularlibraries.data.db.AppDB appDB = null;
    
    @java.lang.Override()
    public void insertUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser> users) {
    }
    
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
    
    @java.lang.Override()
    public void insertRepository(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository repository) {
    }
    
    @java.lang.Override()
    public void insertRepositories(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> repositories) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository>> getRepositoriesOnUserLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> getRepositoryOnUserLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String repositoryName) {
        return null;
    }
    
    @javax.inject.Inject()
    public GithubCacheImpl(@org.jetbrains.annotations.NotNull()
    @ru.gendalf13666.popularlibraries.helpers.di.AppDataBase()
    ru.gendalf13666.popularlibraries.data.db.AppDB appDB) {
        super();
    }
}