package com.example.data.entities.member

import com.example.data.util.MemberClass
import com.google.gson.annotations.SerializedName

data class MemberUpdateEntity(
    @SerializedName("username") val userName: String,
    @SerializedName("password") val userPWD: String,
    @SerializedName("email") val userEmail: String,
    @SerializedName("phoneNumber") val userPhoneNumber: String,
    @SerializedName("memberClass") val userClass: MemberClass,
    @SerializedName("groupIdList") val userGroupList: List<Int>
)
