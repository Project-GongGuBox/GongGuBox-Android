package com.example.model.member

/* TODO("Is that Right? Need to Check Entity Naming") */
data class MemberEntity(
    val id: Long,
    val email: String,
    val memberClass: MemberClass,
    val phoneNumber: String,
    val username: String
)
