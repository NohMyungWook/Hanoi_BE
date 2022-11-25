package com.domain.user.dto

import com.fasterxml.jackson.annotation.JsonProperty

class LoginDTO(
    @JsonProperty("userId")
    var userId: String,
    @JsonProperty("userPw")
    var userPw: String
)