package com.hanoi.domain.user.entity

import com.hanoi.domain.user.dto.LoginDTO
import com.hanoi.domain.user.dto.UserDTO
import javax.persistence.*

@Entity
@Table(name = "user")
class User(
    @Id
    val no: Long = 0,
    var userId: String,
    var userPw: String,
    var name: String,
    var email: String
) {
    fun toLoginDTO(): LoginDTO {
        return LoginDTO(
            userId =  userId,
            userPw = userPw
        )
    }

    fun toCreateUserDTO(): UserDTO {
        return UserDTO(
            userId = userId,
            userPw = userPw,
            name = name,
            email = email
        )
    }

    fun update(createQuestionDTO: UserDTO) {
        userId = createQuestionDTO.userId
        userPw = createQuestionDTO.userPw
        name = createQuestionDTO.name
        email = createQuestionDTO.email
    }
}
