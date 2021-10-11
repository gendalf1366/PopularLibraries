package ru.gendalf13666.popularlibraries.helpers.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lru/gendalf13666/popularlibraries/App;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, ru.gendalf13666.popularlibraries.helpers.di.modules.UserModule.class, ru.gendalf13666.popularlibraries.helpers.di.modules.ApiModule.class, ru.gendalf13666.popularlibraries.helpers.di.modules.DBModule.class, ru.gendalf13666.popularlibraries.helpers.di.modules.UIModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<ru.gendalf13666.popularlibraries.App> {
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/di/AppComponent$Builder;", "", "build", "Lru/gendalf13666/popularlibraries/helpers/di/AppComponent;", "withAppScheduler", "appSchedulers", "Lru/gendalf13666/popularlibraries/helpers/schedules/AppSchedulers;", "withContext", "context", "Landroid/content/Context;", "withNavigationHolder", "navigatorHolder", "Lcom/github/terrakok/cicerone/NavigatorHolder;", "withRouter", "router", "Lcom/github/terrakok/cicerone/Router;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract ru.gendalf13666.popularlibraries.helpers.di.AppComponent.Builder withContext(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract ru.gendalf13666.popularlibraries.helpers.di.AppComponent.Builder withRouter(@org.jetbrains.annotations.NotNull()
        com.github.terrakok.cicerone.Router router);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract ru.gendalf13666.popularlibraries.helpers.di.AppComponent.Builder withNavigationHolder(@org.jetbrains.annotations.NotNull()
        com.github.terrakok.cicerone.NavigatorHolder navigatorHolder);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract ru.gendalf13666.popularlibraries.helpers.di.AppComponent.Builder withAppScheduler(@org.jetbrains.annotations.NotNull()
        ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers appSchedulers);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ru.gendalf13666.popularlibraries.helpers.di.AppComponent build();
    }
}