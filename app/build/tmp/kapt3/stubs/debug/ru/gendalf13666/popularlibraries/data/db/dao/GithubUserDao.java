package ru.gendalf13666.popularlibraries.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\'\u00a8\u0006\f"}, d2 = {"Lru/gendalf13666/popularlibraries/data/db/dao/GithubUserDao;", "", "getUser", "Lio/reactivex/rxjava3/core/Single;", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "userLogin", "", "getUsers", "", "insert", "", "users", "app_debug"})
public abstract interface GithubUserDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser> users);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from users")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from users where login = :userLogin")
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.data.entity.GithubUser> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userLogin);
}