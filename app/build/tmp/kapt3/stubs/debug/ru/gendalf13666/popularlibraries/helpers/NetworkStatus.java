package ru.gendalf13666.popularlibraries.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/NetworkStatus;", "", "isOnline", "Lio/reactivex/rxjava3/core/Observable;", "", "isOnlineSingle", "Lio/reactivex/rxjava3/core/Single;", "app_debug"})
public abstract interface NetworkStatus {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Observable<java.lang.Boolean> isOnline();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.lang.Boolean> isOnlineSingle();
}