package ru.gendalf13666.popularlibraries.baselogic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH&R&\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/ListPresenter;", "T", "", "itemClickListener", "Lkotlin/Function1;", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "bindView", "view", "(Ljava/lang/Object;)V", "getCount", "", "app_debug"})
public abstract interface ListPresenter<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract kotlin.jvm.functions.Function1<T, kotlin.Unit> getItemClickListener();
    
    public abstract void setItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> p0);
    
    public abstract void bindView(T view);
    
    public abstract int getCount();
}