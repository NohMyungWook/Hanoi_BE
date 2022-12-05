package com.domain.user.repository

import com.domain.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByUserIdAndUserPw(): List<User>
}
