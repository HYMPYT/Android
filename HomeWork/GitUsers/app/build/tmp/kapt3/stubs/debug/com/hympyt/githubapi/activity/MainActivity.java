package com.hympyt.githubapi.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0014J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0016\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/hympyt/githubapi/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/hympyt/githubapi/room/RoomDbCallback;", "()V", "adapter", "Lcom/hympyt/githubapi/adapter/UserAdapter;", "binding", "Lcom/hympyt/githubapi/databinding/ActivityMainBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onUserAdded", "onUserDeleted", "onUserUpdated", "onUsersReady", "users", "", "Lcom/hympyt/githubapi/entity/User;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.hympyt.githubapi.room.RoomDbCallback {
    private com.hympyt.githubapi.databinding.ActivityMainBinding binding;
    private com.hympyt.githubapi.adapter.UserAdapter adapter;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onUsersReady(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hympyt.githubapi.entity.User> users) {
    }
    
    @java.lang.Override()
    public void onUserAdded() {
    }
    
    @java.lang.Override()
    public void onUserUpdated() {
    }
    
    @java.lang.Override()
    public void onUserDeleted() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
}