package ru.gendalf13666.popularlibraries.model.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\n\u001a\u00020\u0006H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\fH&\u00a8\u0006\r"}, d2 = {"Lru/gendalf13666/popularlibraries/model/repo/IGithubUsersRepo;", "", "getUserByLogin", "Lio/reactivex/rxjava3/core/Maybe;", "Lru/gendalf13666/popularlibraries/model/entity/GithubUser;", "login", "", "getUserRepos", "", "Lru/gendalf13666/popularlibraries/model/entity/GithubUserRepo;", "url", "getUsers", "Lio/reactivex/rxjava3/core/Observable;", "app_debug"})
public abstract interface IGithubUsersRepo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUser>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Maybe<ru.gendalf13666.popularlibraries.model.entity.GithubUser> getUserByLogin(@org.jetbrains.annotations.Nullable()
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Maybe<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo>> getUserRepos(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
}