package ru.gendalf13666.popularlibraries.baselogic.userrepositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010,\u001a\u00020-H\u0016J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\u001eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001d\u0010)\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b*\u0010 \u00a8\u0006="}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryFragment;", "Lru/gendalf13666/popularlibraries/helpers/di/BaseDaggerFragment;", "Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryView;", "Lru/gendalf13666/popularlibraries/baselogic/BackButtonListener;", "()V", "appSchedulers", "Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "getAppSchedulers", "()Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "setAppSchedulers", "(Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;)V", "binding", "Lru/gendalf13666/popularlibraries/databinding/RepositoryFragmentBinding;", "getBinding", "()Lru/gendalf13666/popularlibraries/databinding/RepositoryFragmentBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "githubUsersRepository", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "getGithubUsersRepository", "()Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "setGithubUsersRepository", "(Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;)V", "presenter", "Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryPresenter;", "getPresenter", "()Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryPresenter;", "presenter$delegate", "Lmoxy/ktx/MoxyKtxDelegate;", "repositoryName", "", "getRepositoryName", "()Ljava/lang/String;", "repositoryName$delegate", "Lkotlin/Lazy;", "router", "Lcom/github/terrakok/cicerone/Router;", "getRouter", "()Lcom/github/terrakok/cicerone/Router;", "setRouter", "(Lcom/github/terrakok/cicerone/Router;)V", "userLogin", "getUserLogin", "userLogin$delegate", "backPressed", "", "onCreateView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showException", "", "throwable", "", "showInfo", "text", "Companion", "app_debug"})
public final class RepositoryFragment extends ru.gendalf13666.popularlibraries.helpers.di.BaseDaggerFragment implements ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryView, ru.gendalf13666.popularlibraries.baselogic.BackButtonListener {
    @javax.inject.Inject()
    public com.github.terrakok.cicerone.Router router;
    @javax.inject.Inject()
    public ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers;
    @javax.inject.Inject()
    public ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository githubUsersRepository;
    private final kotlin.Lazy userLogin$delegate = null;
    private final kotlin.Lazy repositoryName$delegate = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final moxy.ktx.MoxyKtxDelegate presenter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_LOGIN = "userLogin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REPOSITORY_NAME = "repositoryName";
    @org.jetbrains.annotations.NotNull()
    public static final ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers getAppSchedulers() {
        return null;
    }
    
    public final void setAppSchedulers(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository getGithubUsersRepository() {
        return null;
    }
    
    public final void setGithubUsersRepository(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository p0) {
    }
    
    private final java.lang.String getUserLogin() {
        return null;
    }
    
    private final java.lang.String getRepositoryName() {
        return null;
    }
    
    private final ru.gendalf13666.popularlibraries.databinding.RepositoryFragmentBinding getBinding() {
        return null;
    }
    
    private final ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryPresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.constraintlayout.widget.ConstraintLayout onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void showInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void showException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public boolean backPressed() {
        return false;
    }
    
    public RepositoryFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryFragment$Companion;", "", "()V", "REPOSITORY_NAME", "", "USER_LOGIN", "newInstance", "Landroidx/fragment/app/Fragment;", "userLogin", "repositoryName", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String userLogin, @org.jetbrains.annotations.NotNull()
        java.lang.String repositoryName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}