package ru.gendalf13666.popularlibraries.model.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lru/gendalf13666/popularlibraries/model/datasource/CacheUsersDataSource;", "Lru/gendalf13666/popularlibraries/model/datasource/UsersDataSource;", "retain", "Lio/reactivex/rxjava3/core/Single;", "", "Lru/gendalf13666/popularlibraries/model/entity/GithubUser;", "users", "user", "app_debug"})
public abstract interface CacheUsersDataSource extends ru.gendalf13666.popularlibraries.model.datasource.UsersDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUser>> retain(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUser> users);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<ru.gendalf13666.popularlibraries.model.entity.GithubUser> retain(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.model.entity.GithubUser user);
}