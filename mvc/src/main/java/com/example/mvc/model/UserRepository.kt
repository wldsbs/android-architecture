package com.example.mvc.model

class UserRepository(private val userDataSource: UserDataSource) {
    fun insertUserInfo(user: User) {
        userDataSource.insertUserInfo(user)
    }

    fun getUserInfo(): User{
        return userDataSource.getUserInfo()
    }

}
