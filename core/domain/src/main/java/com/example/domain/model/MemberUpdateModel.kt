package com.example.domain.model

data class MemberUpdateModel(
    val userName: String,
    val userPWD: String,
    val userEmail: String,
    val userPhoneNumber: String,
    val userGroupList: List<Int>
)
