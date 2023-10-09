package com.example.data.entities.member

import com.google.gson.annotations.SerializedName

data class MemberJoinEntity(
    @SerializedName("username") val userName: String,
    @SerializedName("email") val userEmail: String,
    @SerializedName("phoneNumber") val userPhoneNumber: String,
    @SerializedName("password") val userPWD: String
)
