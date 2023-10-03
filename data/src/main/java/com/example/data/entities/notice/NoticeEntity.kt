package com.example.data.entities.notice

import com.example.data.util.NoticeClass
import com.google.gson.annotations.SerializedName

/* TODO("Is that Right? Need to Check Attribute Naming") */
data class NoticeEntity(
    @SerializedName("noticeId") val noticeID: Long,
    @SerializedName("title") val noticeTitle: String,
    @SerializedName("content") val noticeContent: String,
    @SerializedName("noticeType") val noticeType: NoticeClass
)
