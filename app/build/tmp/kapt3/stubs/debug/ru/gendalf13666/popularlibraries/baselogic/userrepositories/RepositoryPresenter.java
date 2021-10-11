package ru.gendalf13666.popularlibraries.baselogic.userrepositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryPresenter;", "Lru/gendalf13666/popularlibraries/baselogic/BasePresenter;", "Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryView;", "userRepository", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "appSchedulers", "Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "router_", "Lcom/github/terrakok/cicerone/Router;", "userLogin", "", "repositoryName", "(Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;Lcom/github/terrakok/cicerone/Router;Ljava/lang/String;Ljava/lang/String;)V", "loadData", "", "loadRepositoriesInfo", "Lio/reactivex/rxjava3/disposables/Disposable;", "loin", "repository", "onFirstViewAttach", "app_debug"})
public final class RepositoryPresenter extends ru.gendalf13666.popularlibraries.baselogic.BasePresenter<ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryView> {
    private final ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository userRepository = null;
    private final ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers = null;
    private final java.lang.String userLogin = null;
    private final java.lang.String repositoryName = null;
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    private final void loadData() {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable loadRepositoriesInfo(java.lang.String loin, java.lang.String repository) {
        return null;
    }
    
    @javax.inject.Inject()
    public RepositoryPresenter(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository userRepository, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers, @org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router router_, @org.jetbrains.annotations.Nullable()
    java.lang.String userLogin, @org.jetbrains.annotations.Nullable()
    java.lang.String repositoryName) {
        super(null);
    }
}