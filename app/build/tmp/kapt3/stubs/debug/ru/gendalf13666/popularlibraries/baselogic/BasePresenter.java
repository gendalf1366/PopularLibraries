package ru.gendalf13666.popularlibraries.baselogic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/BasePresenter;", "T", "Lmoxy/MvpView;", "Lmoxy/MvpPresenter;", "router", "Lcom/github/terrakok/cicerone/Router;", "(Lcom/github/terrakok/cicerone/Router;)V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getRouter", "()Lcom/github/terrakok/cicerone/Router;", "backPressed", "", "onDestroy", "", "app_debug"})
public class BasePresenter<T extends moxy.MvpView> extends moxy.MvpPresenter<T> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final com.github.terrakok.cicerone.Router router = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.rxjava3.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final boolean backPressed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.github.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    public BasePresenter(@org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.Router router) {
        super();
    }
}