package com.hanoi.domain.user.repository

import com.hanoi.domain.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun existsByUserIdAndUserPw(userId: String, userPw: String): Boolean
}
