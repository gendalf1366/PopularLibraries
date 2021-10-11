package ru.gendalf13666.popularlibraries.data.db.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H&J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H&\u00a8\u0006\u0014"}, d2 = {"Lru/gendalf13666/popularlibraries/data/db/cache/GithubCache;", "", "getRepositoriesOnUserLogin", "Lio/reactivex/rxjava3/core/Single;", "", "Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepository;", "userLogin", "", "getRepositoryOnUserLogin", "repositoryName", "getUser", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "getUsers", "insertRepositories", "", "repositories", "insertRepository", "repository", "insertUsers", "users", "app_debug"})
public abstract interface GithubCache {
    
    public abstract void insertUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser> users);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUser> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin);
    
    public abstract void insertRepository(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository repository);
    
    public abstract void insertRepositories(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> repositories);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository>> getRepositoriesOnUserLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> getRepositoryOnUserLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String repositoryName);
}