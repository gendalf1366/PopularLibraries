package ru.gendalf13666.popularlibraries.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lru/gendalf13666/popularlibraries/view/UserFragment;", "Lmoxy/MvpAppCompatFragment;", "Lru/gendalf13666/popularlibraries/view/UserView;", "()V", "binding", "Lru/gendalf13666/popularlibraries/databinding/FragmentUserBinding;", "getBinding", "()Lru/gendalf13666/popularlibraries/databinding/FragmentUserBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "presenter", "Lru/gendalf13666/popularlibraries/presenter/UserPresenter;", "getPresenter", "()Lru/gendalf13666/popularlibraries/presenter/UserPresenter;", "presenter$delegate", "Lmoxy/ktx/MoxyKtxDelegate;", "reposAdapter", "Lru/gendalf13666/popularlibraries/view/adapters/UserReposRVAdapter;", "init", "", "showRepo", "repo", "Lru/gendalf13666/popularlibraries/model/entity/GithubUserRepo;", "showToast", "message", "", "showUser", "user", "Lru/gendalf13666/popularlibraries/view/GithubUserViewModel;", "updateRepos", "Companion", "app_debug"})
public final class UserFragment extends moxy.MvpAppCompatFragment implements ru.gendalf13666.popularlibraries.view.UserView {
    @org.jetbrains.annotations.NotNull()
    public static final ru.gendalf13666.popularlibraries.view.UserFragment.Companion Companion = null;
    private static final java.lang.String GITHUB_USER_LOGIN_KEY = "github_user_login_key";
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private ru.gendalf13666.popularlibraries.view.adapters.UserReposRVAdapter reposAdapter;
    private final moxy.ktx.MoxyKtxDelegate presenter$delegate = null;
    
    public UserFragment() {
        super();
    }
    
    private final ru.gendalf13666.popularlibraries.databinding.FragmentUserBinding getBinding() {
        return null;
    }
    
    private final ru.gendalf13666.popularlibraries.presenter.UserPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void showUser(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.view.GithubUserViewModel user) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void updateRepos() {
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    @java.lang.Override()
    public void showRepo(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo repo) {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lru/gendalf13666/popularlibraries/view/UserFragment$Companion;", "", "()V", "GITHUB_USER_LOGIN_KEY", "", "newInstance", "Landroidx/fragment/app/Fragment;", "login", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String login) {
            return null;
        }
    }
}