package com.hympyt.githubapi.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/hympyt/githubapi/room/UserDao;", "", "add", "", "users", "", "Lcom/hympyt/githubapi/entity/User;", "([Lcom/hympyt/githubapi/entity/User;)V", "delete", "user", "get", "Lio/reactivex/Maybe;", "", "id", "", "update", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM users WHERE id = :id")
    public abstract io.reactivex.Maybe<com.hympyt.githubapi.entity.User> get(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM users")
    public abstract io.reactivex.Maybe<java.util.List<com.hympyt.githubapi.entity.User>> get();
    
    @androidx.room.Insert()
    public abstract void add(@org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.entity.User... users);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.entity.User user);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.entity.User user);
}