package com.example.model.member

data class MemberUpdateEntity(
    val username: String,
    val password: String,
    val email: String,
    val phoneNumber: String,
    val memberClass: MemberClass,
    val groupIdList: List<Int>
)
