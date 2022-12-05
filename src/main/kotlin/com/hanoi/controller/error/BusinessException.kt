package com.hanoi.controller.error

open class BusinessException(
    val errorCode: ErrorCode
) : RuntimeException()