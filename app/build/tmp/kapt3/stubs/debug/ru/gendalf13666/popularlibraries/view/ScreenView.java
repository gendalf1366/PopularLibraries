package ru.gendalf13666.popularlibraries.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lru/gendalf13666/popularlibraries/view/ScreenView;", "Lmoxy/MvpView;", "showToast", "", "message", "", "app_debug"})
@moxy.viewstate.strategy.StateStrategyType(value = moxy.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface ScreenView extends moxy.MvpView {
    
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
}