package ru.gendalf13666.popularlibraries.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH&R&\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lru/gendalf13666/popularlibraries/presenter/IListPresenter;", "V", "Lru/gendalf13666/popularlibraries/view/IItemView;", "", "itemClickListener", "Lkotlin/Function1;", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "bindView", "view", "(Lru/gendalf13666/popularlibraries/view/IItemView;)V", "getCount", "", "app_debug"})
public abstract interface IListPresenter<V extends ru.gendalf13666.popularlibraries.view.IItemView> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract kotlin.jvm.functions.Function1<V, kotlin.Unit> getItemClickListener();
    
    public abstract void setItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super V, kotlin.Unit> p0);
    
    public abstract void bindView(@org.jetbrains.annotations.NotNull()
    V view);
    
    public abstract int getCount();
}