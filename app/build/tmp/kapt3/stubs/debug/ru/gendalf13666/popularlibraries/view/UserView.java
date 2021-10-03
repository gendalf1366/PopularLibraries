package ru.gendalf13666.popularlibraries.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lru/gendalf13666/popularlibraries/view/UserView;", "Lru/gendalf13666/popularlibraries/view/ScreenView;", "init", "", "showRepo", "repo", "Lru/gendalf13666/popularlibraries/model/entity/GithubUserRepo;", "showUser", "user", "Lru/gendalf13666/popularlibraries/view/GithubUserViewModel;", "updateRepos", "app_debug"})
@moxy.viewstate.strategy.StateStrategyType(value = moxy.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface UserView extends ru.gendalf13666.popularlibraries.view.ScreenView {
    
    public abstract void showUser(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.view.GithubUserViewModel user);
    
    public abstract void updateRepos();
    
    public abstract void init();
    
    public abstract void showRepo(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo repo);
}