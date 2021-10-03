package ru.gendalf13666.popularlibraries.model.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lru/gendalf13666/popularlibraries/model/repo/GithubUsersRepo;", "Lru/gendalf13666/popularlibraries/model/repo/IGithubUsersRepo;", "usersDataSource", "Lru/gendalf13666/popularlibraries/model/datasource/UsersDataSource;", "cacheUsersDataSource", "Lru/gendalf13666/popularlibraries/model/datasource/CacheUsersDataSource;", "(Lru/gendalf13666/popularlibraries/model/datasource/UsersDataSource;Lru/gendalf13666/popularlibraries/model/datasource/CacheUsersDataSource;)V", "getUserByLogin", "Lio/reactivex/rxjava3/core/Maybe;", "Lru/gendalf13666/popularlibraries/model/entity/GithubUser;", "login", "", "getUserRepos", "", "Lru/gendalf13666/popularlibraries/model/entity/GithubUserRepo;", "url", "getUsers", "Lio/reactivex/rxjava3/core/Observable;", "app_debug"})
public final class GithubUsersRepo implements ru.gendalf13666.popularlibraries.model.repo.IGithubUsersRepo {
    private final ru.gendalf13666.popularlibraries.model.datasource.UsersDataSource usersDataSource = null;
    private final ru.gendalf13666.popularlibraries.model.datasource.CacheUsersDataSource cacheUsersDataSource = null;
    
    public GithubUsersRepo(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.model.datasource.UsersDataSource usersDataSource, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.model.datasource.CacheUsersDataSource cacheUsersDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Observable<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUser>> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Maybe<ru.gendalf13666.popularlibraries.model.entity.GithubUser> getUserByLogin(@org.jetbrains.annotations.Nullable()
    java.lang.String login) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Maybe<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo>> getUserRepos(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
}