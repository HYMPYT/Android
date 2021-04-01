package com.hympyt.githubapi.room

import com.hympyt.githubapi.entity.User

interface RoomDbCallback {
    fun onUsersReady(users: List<User>)
    fun onUserAdded()
    fun onUserUpdated()
    fun onUserDeleted()
}