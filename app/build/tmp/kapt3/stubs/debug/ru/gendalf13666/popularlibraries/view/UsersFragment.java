package ru.gendalf13666.popularlibraries.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lru/gendalf13666/popularlibraries/view/UsersFragment;", "Lmoxy/MvpAppCompatFragment;", "Lru/gendalf13666/popularlibraries/view/UsersView;", "Lru/gendalf13666/popularlibraries/presenter/BackButtonListener;", "()V", "adapter", "Lru/gendalf13666/popularlibraries/view/adapters/UsersRVAdapter;", "binding", "Lru/gendalf13666/popularlibraries/databinding/FragmentUsersBinding;", "getBinding", "()Lru/gendalf13666/popularlibraries/databinding/FragmentUsersBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "presenter", "Lru/gendalf13666/popularlibraries/presenter/UsersPresenter;", "getPresenter", "()Lru/gendalf13666/popularlibraries/presenter/UsersPresenter;", "presenter$delegate", "Lmoxy/ktx/MoxyKtxDelegate;", "backPressed", "", "init", "", "showToast", "message", "", "updateList", "Companion", "app_debug"})
public final class UsersFragment extends moxy.MvpAppCompatFragment implements ru.gendalf13666.popularlibraries.view.UsersView, ru.gendalf13666.popularlibraries.presenter.BackButtonListener {
    @org.jetbrains.annotations.NotNull()
    public static final ru.gendalf13666.popularlibraries.view.UsersFragment.Companion Companion = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final moxy.ktx.MoxyKtxDelegate presenter$delegate = null;
    private ru.gendalf13666.popularlibraries.view.adapters.UsersRVAdapter adapter;
    
    public UsersFragment() {
        super();
    }
    
    private final ru.gendalf13666.popularlibraries.databinding.FragmentUsersBinding getBinding() {
        return null;
    }
    
    private final ru.gendalf13666.popularlibraries.presenter.UsersPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void updateList() {
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public boolean backPressed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lru/gendalf13666/popularlibraries/view/UsersFragment$Companion;", "", "()V", "newInstance", "Lru/gendalf13666/popularlibraries/view/UsersFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.gendalf13666.popularlibraries.view.UsersFragment newInstance() {
            return null;
        }
    }
}