package ru.gendalf13666.popularlibraries.baselogic.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/user/UserPresenter;", "Lru/gendalf13666/popularlibraries/baselogic/BasePresenter;", "Lru/gendalf13666/popularlibraries/baselogic/user/UserView;", "userRepository", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "appSchedulers", "Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "userAvatarRepository", "Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepository;", "router", "Lcom/github/terrakok/cicerone/Router;", "repositoryListPresenter", "Lru/gendalf13666/popularlibraries/baselogic/user/RepositoryListPresenter;", "userLogin", "", "(Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepository;Lcom/github/terrakok/cicerone/Router;Lru/gendalf13666/popularlibraries/baselogic/user/RepositoryListPresenter;Ljava/lang/String;)V", "getRepositoryListPresenter", "()Lru/gendalf13666/popularlibraries/baselogic/user/RepositoryListPresenter;", "loadData", "", "loadRepositoriesInfo", "Lio/reactivex/rxjava3/disposables/Disposable;", "login", "loadUserInfo", "onFirstViewAttach", "app_debug"})
public final class UserPresenter extends ru.gendalf13666.popularlibraries.baselogic.BasePresenter<ru.gendalf13666.popularlibraries.baselogic.user.UserView> {
    private final ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository userRepository = null;
    private final ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers = null;
    private final ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepository userAvatarRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.gendalf13666.popularlibraries.baselogic.user.RepositoryListPresenter repositoryListPresenter = null;
    private final java.lang.String userLogin = null;
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    private final void loadData() {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable loadRepositoriesInfo(java.lang.String login) {
        return null;
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable loadUserInfo(java.lang.String login) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.gendalf13666.popularlibraries.baselogic.user.RepositoryListPresenter getRepositoryListPresenter() {
        return null;
    }
    
    public UserPresenter(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository userRepository, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepository userAvatarRepository, @org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router router, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.baselogic.user.RepositoryListPresenter repositoryListPresenter, @org.jetbrains.annotations.Nullable()
    java.lang.String userLogin) {
        super(null);
    }
}