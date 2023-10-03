package com.example.data.entities.member

import com.google.gson.annotations.SerializedName

data class MemberLogInEntity(
    @SerializedName("username") val userName: String,
    @SerializedName("password") val userPWD: String
)
