package com.example.mvc.model

class UserDataSource{
    private val userInfo = User("1", "name", "phone", "email")

    fun getUserInfo(): User {
        return userInfo
    }

    fun insertUserInfo(user: User) {
        userInfo.apply {
            id = user.id
            name = user.name
            phone = user.phone
            email = user.email
        }
    }



}
