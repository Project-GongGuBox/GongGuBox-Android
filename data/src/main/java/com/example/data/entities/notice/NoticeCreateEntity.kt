package com.example.data.entities.notice

import com.example.data.util.NoticeClass
import com.google.gson.annotations.SerializedName

data class NoticeCreateEntity(
    @SerializedName("title") val noticeTitle: String,
    @SerializedName("content") val noticeContent: String,
    @SerializedName("noticeType") val noticeType: NoticeClass
)
