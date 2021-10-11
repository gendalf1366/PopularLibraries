package ru.gendalf13666.popularlibraries.baselogic.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0004H&\u00a8\u0006\f"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/user/UserView;", "Lmoxy/MvpView;", "Lru/gendalf13666/popularlibraries/baselogic/ExceptionView;", "init", "", "showUser", "user", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "requestBuilder", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "updateRepositoryList", "app_debug"})
@moxy.viewstate.strategy.alias.SingleState()
public abstract interface UserView extends moxy.MvpView, ru.gendalf13666.popularlibraries.baselogic.ExceptionView {
    
    public abstract void init();
    
    public abstract void showUser(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.entity.GithubUser user, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> requestBuilder);
    
    public abstract void updateRepositoryList();
}