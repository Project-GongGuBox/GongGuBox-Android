package com.example.data.entities

import com.google.gson.annotations.SerializedName

data class LogInMemberEntity(
    @SerializedName("username") val userName: String,
    @SerializedName("password") val userPWD: String
)
