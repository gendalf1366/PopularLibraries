package ru.gendalf13666.popularlibraries.data.db;

import java.lang.System;

@androidx.room.Database(entities = {ru.gendalf13666.popularlibraries.data.entity.GithubUser.class, ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lru/gendalf13666/popularlibraries/data/db/AppDB;", "Landroidx/room/RoomDatabase;", "()V", "githubUserDao", "Lru/gendalf13666/popularlibraries/data/db/dao/GithubUserDao;", "githubUserRepositoryDao", "Lru/gendalf13666/popularlibraries/data/db/dao/GithubUserRepositoryDao;", "Companion", "app_debug"})
public abstract class AppDB extends androidx.room.RoomDatabase {
    public static final int DB_VERSION = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "app.db";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_USERS = "users";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_USER_REPOSITORIES = "user_repositories";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN = "login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AVATAR_URL = "avatar_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REPOSITORY_ID = "repository_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FULL_NAME = "full_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORKS = "forks";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIZE = "size";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATED = "created";
    @org.jetbrains.annotations.NotNull()
    public static final ru.gendalf13666.popularlibraries.data.db.AppDB.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.gendalf13666.popularlibraries.data.db.dao.GithubUserDao githubUserDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.gendalf13666.popularlibraries.data.db.dao.GithubUserRepositoryDao githubUserRepositoryDao();
    
    public AppDB() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lru/gendalf13666/popularlibraries/data/db/AppDB$Companion;", "", "()V", "AVATAR_URL", "", "CREATED", "DB_NAME", "DB_VERSION", "", "FORKS", "FULL_NAME", "LOGIN", "NAME", "REPOSITORY_ID", "SIZE", "TABLE_USERS", "TABLE_USER_REPOSITORIES", "USER_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}