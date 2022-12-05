package com.hanoi.domain.user.dto

import com.hanoi.domain.user.entity.User
import com.fasterxml.jackson.annotation.JsonProperty

class UserDTO(
        @JsonProperty("userId")
        var userId: String,
        @JsonProperty("userPw")
        var userPw: String,
        @JsonProperty("name")
        var name: String,
        @JsonProperty("email")
        var email: String,
) {
    fun toEntity(): User {
        return User(
            userId = userId,
            userPw = userPw,
            name = name,
            email = email
        )
    }
}