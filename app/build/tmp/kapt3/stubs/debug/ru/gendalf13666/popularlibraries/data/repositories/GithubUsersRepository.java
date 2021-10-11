package ru.gendalf13666.popularlibraries.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u0007H&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "", "getRepositories", "Lio/reactivex/rxjava3/core/Single;", "", "Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepository;", "login", "", "getRepository", "repositoryName", "getUser", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "userLogin", "getUsers", "app_debug"})
public abstract interface GithubUsersRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUser> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository>> getRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> getRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String repositoryName);
}