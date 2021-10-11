package ru.gendalf13666.popularlibraries.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\'J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a8\u0006\r"}, d2 = {"Lru/gendalf13666/popularlibraries/data/db/dao/GithubUserRepositoryDao;", "", "getRepositories", "Lio/reactivex/rxjava3/core/Single;", "", "Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepository;", "userLogin", "", "getRepositoryOnUserLogin", "repositoryName", "insert", "", "repositories", "app_debug"})
public abstract interface GithubUserRepositoryDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> repositories);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select r.* from user_repositories r, users u where r.user_id = u.user_id and u.login = :userLogin")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository>> getRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select r.* from user_repositories r, users u where r.name = :repositoryName and r.user_id = u.user_id and u.login = :userLogin")
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> getRepositoryOnUserLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String repositoryName);
}