package com.example.data.entities.member

import com.example.data.util.MemberClass
import com.google.gson.annotations.SerializedName

/* TODO("Is that Right? Need to Check Entity Naming") */
data class MemberEntity(
    @SerializedName("id") val memberID: Long,
    @SerializedName("email") val memberEmail: String,
    @SerializedName("memberClass") val memberClass: MemberClass,
    @SerializedName("phoneNumber") val memberPhoneNumber: String,
    @SerializedName("username") val memberName: String
)
