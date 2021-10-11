package ru.gendalf13666.popularlibraries.baselogic.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/user/RepositoryListPresenter;", "Lru/gendalf13666/popularlibraries/baselogic/ListPresenter;", "Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryItemView;", "()V", "itemClickListener", "Lkotlin/Function1;", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "repositories", "", "Lru/gendalf13666/popularlibraries/data/entity/GithubUserRepository;", "getRepositories", "()Ljava/util/List;", "bindView", "view", "getCount", "", "app_debug"})
public final class RepositoryListPresenter implements ru.gendalf13666.popularlibraries.baselogic.ListPresenter<ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryItemView> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> repositories = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryItemView, kotlin.Unit> itemClickListener;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository> getRepositories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryItemView, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    @java.lang.Override()
    public void setItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryItemView, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void bindView(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryItemView view) {
    }
    
    public RepositoryListPresenter() {
        super();
    }
}