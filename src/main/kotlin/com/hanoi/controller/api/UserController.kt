package com.hanoi.controller.api

import com.hanoi.domain.user.dto.LoginDTO
import com.hanoi.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {
    @PostMapping("/login")
    fun login(
        @RequestBody loginInfo: LoginDTO
    ): ResponseEntity<Any> {
        return try {
            return if(userService.login(loginInfo))
                ResponseEntity.ok().body(null)
            else ResponseEntity.status(HttpStatus.NOT_FOUND).body("입력하신 정보에 일치하는 회원을 찾을 수 없습니다.")
        } catch (e: Exception) {
            e.printStackTrace()
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null)
        }
    }
}