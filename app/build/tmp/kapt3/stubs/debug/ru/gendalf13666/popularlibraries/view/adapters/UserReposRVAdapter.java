package ru.gendalf13666.popularlibraries.view.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/gendalf13666/popularlibraries/view/adapters/UserReposRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/gendalf13666/popularlibraries/view/adapters/UserReposRVAdapter$ViewHolder;", "presenter", "Lru/gendalf13666/popularlibraries/presenter/IUserReposListPresenter;", "(Lru/gendalf13666/popularlibraries/presenter/IUserReposListPresenter;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class UserReposRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ru.gendalf13666.popularlibraries.view.adapters.UserReposRVAdapter.ViewHolder> {
    private final ru.gendalf13666.popularlibraries.presenter.IUserReposListPresenter presenter = null;
    
    public UserReposRVAdapter(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.presenter.IUserReposListPresenter presenter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.gendalf13666.popularlibraries.view.adapters.UserReposRVAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.view.adapters.UserReposRVAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lru/gendalf13666/popularlibraries/view/adapters/UserReposRVAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lru/gendalf13666/popularlibraries/view/UserRepoItemView;", "binding", "Lru/gendalf13666/popularlibraries/databinding/ViewItemUserRepoBinding;", "(Lru/gendalf13666/popularlibraries/view/adapters/UserReposRVAdapter;Lru/gendalf13666/popularlibraries/databinding/ViewItemUserRepoBinding;)V", "pos", "", "getPos", "()I", "setPos", "(I)V", "setRepoName", "", "repoName", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements ru.gendalf13666.popularlibraries.view.UserRepoItemView {
        private final ru.gendalf13666.popularlibraries.databinding.ViewItemUserRepoBinding binding = null;
        private int pos = -1;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        ru.gendalf13666.popularlibraries.databinding.ViewItemUserRepoBinding binding) {
            super(null);
        }
        
        @java.lang.Override()
        public void setRepoName(@org.jetbrains.annotations.NotNull()
        java.lang.String repoName) {
        }
        
        @java.lang.Override()
        public int getPos() {
            return 0;
        }
        
        @java.lang.Override()
        public void setPos(int p0) {
        }
    }
}