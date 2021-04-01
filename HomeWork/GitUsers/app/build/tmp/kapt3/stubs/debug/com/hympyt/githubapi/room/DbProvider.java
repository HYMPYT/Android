package com.hympyt.githubapi.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/hympyt/githubapi/room/DbProvider;", "", "()V", "DB_NAME", "", "db", "Lcom/hympyt/githubapi/room/GitHubDatabase;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "addUser", "", "user", "Lcom/hympyt/githubapi/entity/User;", "callback", "Lcom/hympyt/githubapi/room/RoomDbCallback;", "deleteUser", "oldId", "", "disposeAll", "getApiUsers", "getCacheUsers", "getUsers", "init", "context", "Landroid/content/Context;", "updateUser", "newUser", "app_debug"})
public final class DbProvider {
    private static final java.lang.String DB_NAME = "githubDb";
    private static com.hympyt.githubapi.room.GitHubDatabase db;
    private static final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.hympyt.githubapi.room.DbProvider INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.entity.User user, @org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.room.RoomDbCallback callback) {
    }
    
    public final void getUsers(@org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.room.RoomDbCallback callback) {
    }
    
    public final void getCacheUsers(@org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.room.RoomDbCallback callback) {
    }
    
    private final void getApiUsers(com.hympyt.githubapi.room.RoomDbCallback callback) {
    }
    
    public final void updateUser(int oldId, @org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.entity.User newUser, @org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.room.RoomDbCallback callback) {
    }
    
    public final void deleteUser(int oldId, @org.jetbrains.annotations.NotNull()
    com.hympyt.githubapi.room.RoomDbCallback callback) {
    }
    
    public final void disposeAll() {
    }
    
    private DbProvider() {
        super();
    }
}