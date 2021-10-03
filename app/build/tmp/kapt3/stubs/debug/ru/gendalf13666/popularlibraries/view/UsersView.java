package ru.gendalf13666.popularlibraries.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lru/gendalf13666/popularlibraries/view/UsersView;", "Lru/gendalf13666/popularlibraries/view/ScreenView;", "init", "", "updateList", "app_debug"})
@moxy.viewstate.strategy.StateStrategyType(value = moxy.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface UsersView extends ru.gendalf13666.popularlibraries.view.ScreenView {
    
    public abstract void init();
    
    public abstract void updateList();
}