package com.hympyt.githubapi.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/hympyt/githubapi/network/ApiClient;", "", "()V", "PER_PAGE", "", "URL", "", "client", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "buildService", "T", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "app_debug"})
public final class ApiClient {
    private static final java.lang.String URL = "https://api.github.com/";
    public static final int PER_PAGE = 100;
    private static final okhttp3.OkHttpClient client = null;
    private static final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.hympyt.githubapi.network.ApiClient INSTANCE = null;
    
    public final <T extends java.lang.Object>T buildService(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> service) {
        return null;
    }
    
    private ApiClient() {
        super();
    }
}