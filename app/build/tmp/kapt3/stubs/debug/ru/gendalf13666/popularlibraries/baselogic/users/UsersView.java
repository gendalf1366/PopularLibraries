package ru.gendalf13666.popularlibraries.baselogic.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/users/UsersView;", "Lmoxy/MvpView;", "Lru/gendalf13666/popularlibraries/baselogic/ExceptionView;", "init", "", "updateList", "app_debug"})
@moxy.viewstate.strategy.alias.AddToEndSingle()
public abstract interface UsersView extends moxy.MvpView, ru.gendalf13666.popularlibraries.baselogic.ExceptionView {
    
    public abstract void init();
    
    public abstract void updateList();
}