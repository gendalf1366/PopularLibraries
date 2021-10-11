package ru.gendalf13666.popularlibraries.helpers.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/di/modules/ApiModule;", "", "()V", "provideBaseUrl", "", "provideGithubApi", "Lru/gendalf13666/popularlibraries/api/GithubApi;", "baseUrl", "Companion", "app_debug"})
@dagger.Module()
public final class ApiModule {
    private static final java.lang.String API_URL = "api_url";
    @org.jetbrains.annotations.NotNull()
    public static final ru.gendalf13666.popularlibraries.helpers.di.modules.ApiModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Named(value = "api_url")
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final ru.gendalf13666.popularlibraries.api.GithubApi provideGithubApi(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "api_url")
    java.lang.String baseUrl) {
        return null;
    }
    
    public ApiModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/di/modules/ApiModule$Companion;", "", "()V", "API_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}