package ru.gendalf13666.popularlibraries.data.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "user_repositories", indices = {@androidx.room.Index(value = {"user_id"})}, foreignKeys = {@androidx.room.ForeignKey(entity = ru.gendalf13666.popularlibraries.data.entity.GithubUser.class, childColumns = {"user_id"}, onDelete = 5, parentColumns = {"user_id"})})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\tH\u00d6\u0001J\t\u0010-\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepository;", "", "id", "", "userId", "name", "", "fullName", "countForks", "", "size", "created", "(JJLjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getCountForks", "()I", "getCreated", "()Ljava/lang/String;", "getFullName", "getId", "()J", "getName", "setName", "(Ljava/lang/String;)V", "owner", "Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepositoryOwner;", "getOwner", "()Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepositoryOwner;", "setOwner", "(Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepositoryOwner;)V", "getSize", "getUserId", "setUserId", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class GithubUserRepository {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private ru.gendalf13666.popularlibraries.data.entity.GithubUserRepositoryOwner owner;
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "repository_id")
    @com.google.gson.annotations.SerializedName(value = "id")
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "user_id")
    private long userId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "full_name")
    @com.google.gson.annotations.SerializedName(value = "full_name")
    private final java.lang.String fullName = null;
    @androidx.room.ColumnInfo(name = "forks")
    @com.google.gson.annotations.SerializedName(value = "forks")
    private final int countForks = 0;
    @androidx.room.ColumnInfo(name = "size")
    @com.google.gson.annotations.SerializedName(value = "size")
    private final int size = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "created")
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String created = null;
    
    @org.jetbrains.annotations.Nullable()
    public final ru.gendalf13666.popularlibraries.data.entity.GithubUserRepositoryOwner getOwner() {
        return null;
    }
    
    public final void setOwner(@org.jetbrains.annotations.Nullable()
    ru.gendalf13666.popularlibraries.data.entity.GithubUserRepositoryOwner p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final long getUserId() {
        return 0L;
    }
    
    public final void setUserId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final int getCountForks() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated() {
        return null;
    }
    
    public GithubUserRepository(long id, long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, int countForks, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String created) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository copy(long id, long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, int countForks, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String created) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}