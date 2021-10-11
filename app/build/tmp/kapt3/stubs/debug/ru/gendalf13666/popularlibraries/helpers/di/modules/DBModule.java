package ru.gendalf13666.popularlibraries.helpers.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/di/modules/DBModule;", "", "()V", "provideAppDB", "Lru/gendalf13666/popularlibraries/data/db/AppDB;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class DBModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    @ru.gendalf13666.popularlibraries.helpers.di.AppDataBase()
    public final ru.gendalf13666.popularlibraries.data.db.AppDB provideAppDB(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public DBModule() {
        super();
    }
}