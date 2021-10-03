package ru.gendalf13666.popularlibraries.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lru/gendalf13666/popularlibraries/presenter/UserPresenter;", "Lmoxy/MvpPresenter;", "Lru/gendalf13666/popularlibraries/view/UserView;", "login", "", "repo", "Lru/gendalf13666/popularlibraries/model/repo/IGithubUsersRepo;", "(Ljava/lang/String;Lru/gendalf13666/popularlibraries/model/repo/IGithubUsersRepo;)V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "reposPresenter", "Lru/gendalf13666/popularlibraries/presenter/UserPresenter$UserReposListPresenter;", "getReposPresenter", "()Lru/gendalf13666/popularlibraries/presenter/UserPresenter$UserReposListPresenter;", "getUserRepos", "", "url", "onDestroy", "onFirstViewAttach", "setRepoItemClickListener", "UserReposListPresenter", "app_debug"})
public final class UserPresenter extends moxy.MvpPresenter<ru.gendalf13666.popularlibraries.view.UserView> {
    private final java.lang.String login = null;
    private final ru.gendalf13666.popularlibraries.model.repo.IGithubUsersRepo repo = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.gendalf13666.popularlibraries.presenter.UserPresenter.UserReposListPresenter reposPresenter = null;
    
    public UserPresenter(@org.jetbrains.annotations.Nullable()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.model.repo.IGithubUsersRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.gendalf13666.popularlibraries.presenter.UserPresenter.UserReposListPresenter getReposPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    private final void getUserRepos(java.lang.String url) {
    }
    
    private final void setRepoItemClickListener() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lru/gendalf13666/popularlibraries/presenter/UserPresenter$UserReposListPresenter;", "Lru/gendalf13666/popularlibraries/presenter/IUserReposListPresenter;", "()V", "itemClickListener", "Lkotlin/Function1;", "Lru/gendalf13666/popularlibraries/view/UserRepoItemView;", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "repos", "", "Lru/gendalf13666/popularlibraries/model/entity/GithubUserRepo;", "getRepos", "()Ljava/util/List;", "bindView", "view", "getCount", "", "app_debug"})
    public static final class UserReposListPresenter implements ru.gendalf13666.popularlibraries.presenter.IUserReposListPresenter {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo> repos = null;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super ru.gendalf13666.popularlibraries.view.UserRepoItemView, kotlin.Unit> itemClickListener;
        
        public UserReposListPresenter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo> getRepos() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<ru.gendalf13666.popularlibraries.view.UserRepoItemView, kotlin.Unit> getItemClickListener() {
            return null;
        }
        
        @java.lang.Override()
        public void setItemClickListener(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super ru.gendalf13666.popularlibraries.view.UserRepoItemView, kotlin.Unit> p0) {
        }
        
        @java.lang.Override()
        public void bindView(@org.jetbrains.annotations.NotNull()
        ru.gendalf13666.popularlibraries.view.UserRepoItemView view) {
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
    }
}