package com.hympyt.githubapi.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lcom/hympyt/githubapi/room/RoomDbCallback;", "", "onUserAdded", "", "onUserDeleted", "onUserUpdated", "onUsersReady", "users", "", "Lcom/hympyt/githubapi/entity/User;", "app_debug"})
public abstract interface RoomDbCallback {
    
    public abstract void onUsersReady(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hympyt.githubapi.entity.User> users);
    
    public abstract void onUserAdded();
    
    public abstract void onUserUpdated();
    
    public abstract void onUserDeleted();
}