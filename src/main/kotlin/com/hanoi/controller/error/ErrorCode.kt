package com.hanoi.controller.error

import org.springframework.http.HttpStatus

enum class ErrorCode(
    val status: HttpStatus,
    val message: String
) {
    //Common
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류가 발생하였습니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "요청하신 유저 정보를 찾을 수 없습니다.")
}
