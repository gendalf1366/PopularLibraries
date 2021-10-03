package ru.gendalf13666.popularlibraries.model.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\'J%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rH\'\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lru/gendalf13666/popularlibraries/model/api/GithubApi;", "", "getUserByLogin", "Lio/reactivex/rxjava3/core/Single;", "Lru/gendalf13666/popularlibraries/model/entity/GithubUser;", "login", "", "getUserRepos", "", "Lru/gendalf13666/popularlibraries/model/entity/GithubUserRepo;", "url", "getUsers", "since", "", "(Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "app_debug"})
public abstract interface GithubApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUser>> getUsers(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "since")
    java.lang.Integer since);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{username}")
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.model.entity.GithubUser> getUserByLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo>> getUserRepos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}