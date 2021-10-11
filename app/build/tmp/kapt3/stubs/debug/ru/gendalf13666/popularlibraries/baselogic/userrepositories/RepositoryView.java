package ru.gendalf13666.popularlibraries.baselogic.userrepositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryView;", "Lmoxy/MvpView;", "Lru/gendalf13666/popularlibraries/baselogic/ExceptionView;", "showInfo", "", "text", "", "app_debug"})
@moxy.viewstate.strategy.alias.SingleState()
public abstract interface RepositoryView extends moxy.MvpView, ru.gendalf13666.popularlibraries.baselogic.ExceptionView {
    
    public abstract void showInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
}