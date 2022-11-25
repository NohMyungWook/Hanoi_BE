package com.domain.user.controller

import com.domain.user.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userRepository: UserRepository
) {
    @GetMapping("/login")
    fun login(
    ): ResponseEntity<Any> {
        return try {
            ResponseEntity.ok().body(userRepository.findByUserIdAndUserPw())
        } catch (e: Exception) {
            e.printStackTrace()
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null)
        }
    }
}