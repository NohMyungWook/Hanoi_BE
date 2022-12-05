package com.hanoi.domain.user.service

import com.hanoi.controller.error.BusinessException
import com.hanoi.controller.error.ErrorCode
import com.hanoi.domain.user.dto.LoginDTO
import com.hanoi.domain.user.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserService(
    private val userRepository: UserRepository
) {
    fun login(loginInfo: LoginDTO): Boolean{
        return userRepository.existsByUserIdAndUserPw(loginInfo.userId, loginInfo.userPw)
    }
}