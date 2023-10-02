package com.example.data.entities

import com.google.gson.annotations.SerializedName

data class JoinMemberEntity(
    @SerializedName("username") val userName: String,
    @SerializedName("email") val userEmail: String,
    @SerializedName("phoneNumber") val userPhoneNumber: String,
    @SerializedName("password") val userPWD: String
)
