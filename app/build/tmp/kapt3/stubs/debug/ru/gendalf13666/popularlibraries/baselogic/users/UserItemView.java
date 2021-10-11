package ru.gendalf13666.popularlibraries.baselogic.users;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lru/gendalf13666/popularlibraries/baselogic/users/UserItemView;", "", "currentPosition", "", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "setAvatar", "", "user", "Lru/gendalf13666/popularlibraries/data/entity/GithubUser;", "setLogin", "text", "", "app_debug"})
public abstract interface UserItemView {
    
    public abstract int getCurrentPosition();
    
    public abstract void setCurrentPosition(int p0);
    
    public abstract void setLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    public abstract void setAvatar(@org.jetbrains.annotations.NotNull()
    ru.gendalf13666.popularlibraries.data.entity.GithubUser user);
}