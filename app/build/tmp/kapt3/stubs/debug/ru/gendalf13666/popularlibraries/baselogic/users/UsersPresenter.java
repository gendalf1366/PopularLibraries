package ru.gendalf13666.popularlibraries.baselogic.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/users/UsersPresenter;", "Lru/gendalf13666/popularlibraries/baselogic/BasePresenter;", "Lru/gendalf13666/popularlibraries/baselogic/users/UsersView;", "userRepository", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "appSchedulers", "Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "router", "Lcom/github/terrakok/cicerone/Router;", "(Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;Lcom/github/terrakok/cicerone/Router;)V", "usersListPresenter", "Lru/gendalf13666/popularlibraries/baselogic/users/UsersPresenter$UsersUserListPresenter;", "getUsersListPresenter", "()Lru/gendalf13666/popularlibraries/baselogic/users/UsersPresenter$UsersUserListPresenter;", "loadData", "", "onFirstViewAttach", "UsersUserListPresenter", "app_debug"})
public final class UsersPresenter extends ru.gendalf13666.popularlibraries.baselogic.BasePresenter<ru.gendalf13666.popularlibraries.baselogic.users.UsersView> {
    @org.jetbrains.annotations.NotNull()
    private final ru.gendalf13666.popularlibraries.baselogic.users.UsersPresenter.UsersUserListPresenter usersListPresenter = null;
    private final ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository userRepository = null;
    private final ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.gendalf13666.popularlibraries.baselogic.users.UsersPresenter.UsersUserListPresenter getUsersListPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    private final void loadData() {
    }
    
    public UsersPresenter(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository userRepository, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers, @org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router router) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/users/UsersPresenter$UsersUserListPresenter;", "Lru/gendalf13666/popularlibraries/baselogic/users/UsersListPresenter;", "()V", "itemClickListener", "Lkotlin/Function1;", "Lru/gendalf13666/popularlibraries/baselogic/users/UserItemView;", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "users", "", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "getUsers", "()Ljava/util/List;", "bindView", "view", "getCount", "", "app_debug"})
    public static final class UsersUserListPresenter implements ru.gendalf13666.popularlibraries.baselogic.users.UsersListPresenter {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser> users = null;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super ru.gendalf13666.popularlibraries.baselogic.users.UserItemView, kotlin.Unit> itemClickListener;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.gendalf13666.popularlibraries.data.entity.GithubUser> getUsers() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<ru.gendalf13666.popularlibraries.baselogic.users.UserItemView, kotlin.Unit> getItemClickListener() {
            return null;
        }
        
        @java.lang.Override()
        public void setItemClickListener(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super ru.gendalf13666.popularlibraries.baselogic.users.UserItemView, kotlin.Unit> p0) {
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void bindView(@org.jetbrains.annotations.NotNull()
        ru.gendalf13666.popularlibraries.baselogic.users.UserItemView view) {
        }
        
        public UsersUserListPresenter() {
            super();
        }
    }
}