package ru.gendalf13666.popularlibraries.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepositoryImpl;", "Lru/gendalf13666/popularlibraries/data/repositories/UserAvatarRepository;", "context", "Landroid/content/Context;", "networkStatus", "Lru/gendalf13666/popularlibraries/helpers/NetworkStatus;", "(Landroid/content/Context;Lru/gendalf13666/popularlibraries/helpers/NetworkStatus;)V", "imageBuilder", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "user", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "app_debug"})
public final class UserAvatarRepositoryImpl implements ru.gendalf13666.popularlibraries.data.repositories.UserAvatarRepository {
    private final android.content.Context context = null;
    private final ru.gendalf13666.popularlibraries.helpers.NetworkStatus networkStatus = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> imageBuilder(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.entity.GithubUser user) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserAvatarRepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.helpers.NetworkStatus networkStatus) {
        super();
    }
}