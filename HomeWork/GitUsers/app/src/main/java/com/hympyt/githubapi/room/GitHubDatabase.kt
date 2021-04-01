package com.hympyt.githubapi.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hympyt.githubapi.entity.User

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class GitHubDatabase : RoomDatabase(){
    abstract fun userDao():UserDao
}


