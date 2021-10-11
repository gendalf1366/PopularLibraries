package ru.gendalf13666.popularlibraries.baselogic.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000204H\u0016J$\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020?H\u0016J\u001e\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0016J\b\u0010F\u001a\u000204H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001d\u0010+\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.\u00a8\u0006H"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/user/UserFragment;", "Lru/gendalf13666/popularlibraries/helpers/di/BaseDaggerFragment;", "Lru/gendalf13666/popularlibraries/baselogic/user/UserView;", "Lru/gendalf13666/popularlibraries/baselogic/BackButtonListener;", "()V", "adapter", "Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryRVAdapter;", "appSchedulers", "Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "getAppSchedulers", "()Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "setAppSchedulers", "(Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;)V", "binding", "Lru/gendalf13666/popularlibraries/databinding/UserFragmentBinding;", "getBinding", "()Lru/gendalf13666/popularlibraries/databinding/UserFragmentBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "githubUsersRepository", "Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "getGithubUsersRepository", "()Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;", "setGithubUsersRepository", "(Lru/gendalf13666/popularlibraries/data/repositories/GithubUsersRepository;)V", "presenter", "Lru/gendalf13666/popularlibraries/baselogic/user/UserPresenter;", "getPresenter", "()Lru/gendalf13666/popularlibraries/baselogic/user/UserPresenter;", "presenter$delegate", "Lmoxy/ktx/MoxyKtxDelegate;", "router", "Lcom/github/terrakok/cicerone/Router;", "getRouter", "()Lcom/github/terrakok/cicerone/Router;", "setRouter", "(Lcom/github/terrakok/cicerone/Router;)V", "userAvatarRepository", "Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepository;", "getUserAvatarRepository", "()Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepository;", "setUserAvatarRepository", "(Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepository;)V", "userLogin", "", "getUserLogin", "()Ljava/lang/String;", "userLogin$delegate", "Lkotlin/Lazy;", "backPressed", "", "init", "", "onCreateView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showException", "throwable", "", "showUser", "user", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "requestBuilder", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "updateRepositoryList", "Companion", "app_debug"})
public final class UserFragment extends ru.gendalf13666.popularlibraries.helpers.di.BaseDaggerFragment implements ru.gendalf13666.popularlibraries.baselogic.user.UserView, ru.gendalf13666.popularlibraries.baselogic.BackButtonListener {
    @javax.inject.Inject()
    public com.github.terrakok.cicerone.Router router;
    @javax.inject.Inject()
    public ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers;
    @javax.inject.Inject()
    public ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository githubUsersRepository;
    @javax.inject.Inject()
    public ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepository userAvatarRepository;
    private final kotlin.Lazy userLogin$delegate = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryRVAdapter adapter;
    private final moxy.ktx.MoxyKtxDelegate presenter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_LOGIN = "userLogin";
    @org.jetbrains.annotations.NotNull()
    public static final ru.gendalf13666.popularlibraries.baselogic.user.UserFragment.Companion Companion = null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepository getUserAvatarRepository() {
        return null;
    }
    
    public final void setUserAvatarRepository(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepository p0) {
    }
    
    private final java.lang.String getUserLogin() {
        return null;
    }
    
    private final ru.gendalf13666.popularlibraries.databinding.UserFragmentBinding getBinding() {
        return null;
    }
    
    private final ru.gendalf13666.popularlibraries.baselogic.user.UserPresenter getPresenter() {
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
    public void init() {
    }
    
    @java.lang.Override()
    public void showUser(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.entity.GithubUser user, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> requestBuilder) {
    }
    
    @java.lang.Override()
    public void updateRepositoryList() {
    }
    
    @java.lang.Override()
    public void showException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public boolean backPressed() {
        return false;
    }
    
    public UserFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/user/UserFragment$Companion;", "", "()V", "USER_LOGIN", "", "newInstance", "Landroidx/fragment/app/Fragment;", "userLogin", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String userLogin) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}