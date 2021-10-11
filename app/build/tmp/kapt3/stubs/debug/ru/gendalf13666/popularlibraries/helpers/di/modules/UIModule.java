package ru.gendalf13666.popularlibraries.helpers.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lru/gendalf13666/popularlibraries/helpers/di/modules/UIModule;", "", "bindMainActivity", "Lru/gendalf13666/popularlibraries/baselogic/main/MainActivity;", "bindRepositoryFragment", "Lru/gendalf13666/popularlibraries/baselogic/userrepositories/RepositoryFragment;", "bindUserFragment", "Lru/gendalf13666/popularlibraries/baselogic/user/UserFragment;", "bindUsersFragment", "Lru/gendalf13666/popularlibraries/baselogic/users/UsersFragment;", "app_debug"})
@dagger.Module()
public abstract interface UIModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ru.gendalf13666.popularlibraries.baselogic.main.MainActivity bindMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ru.gendalf13666.popularlibraries.baselogic.user.UserFragment bindUserFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ru.gendalf13666.popularlibraries.baselogic.users.UsersFragment bindUsersFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment bindRepositoryFragment();
}