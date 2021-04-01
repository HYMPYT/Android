package com.hympyt.githubapi.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/hympyt/githubapi/network/ApiService;", "", "getUsers", "Lretrofit2/Call;", "", "Lcom/hympyt/githubapi/entity/User;", "perPage", "", "since", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users")
    public abstract retrofit2.Call<java.util.List<com.hympyt.githubapi.entity.User>> getUsers(@retrofit2.http.Query(value = "per_page")
    int perPage, @retrofit2.http.Query(value = "since")
    int since);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}