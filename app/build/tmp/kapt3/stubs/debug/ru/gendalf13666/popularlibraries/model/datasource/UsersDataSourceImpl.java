package ru.gendalf13666.popularlibraries.model.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lru/gendalf13666/popularlibraries/model/datasource/UsersDataSourceImpl;", "Lru/gendalf13666/popularlibraries/model/datasource/UsersDataSource;", "githubApi", "Lru/gendalf13666/popularlibraries/model/api/GithubApi;", "(Lru/gendalf13666/popularlibraries/model/api/GithubApi;)V", "getUserByLogin", "Lio/reactivex/rxjava3/core/Maybe;", "Lru/gendalf13666/popularlibraries/model/entity/GithubUser;", "login", "", "getUserRepos", "", "Lru/gendalf13666/popularlibraries/model/entity/GithubUserRepo;", "url", "getUsers", "Lio/reactivex/rxjava3/core/Single;", "app_debug"})
public final class UsersDataSourceImpl implements ru.gendalf13666.popularlibraries.model.datasource.UsersDataSource {
    private final ru.gendalf13666.popularlibraries.model.api.GithubApi githubApi = null;
    
    public UsersDataSourceImpl(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.model.api.GithubApi githubApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUser>> getUsers() {
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