package com.example.model.notice


data class NoticeCreateEntity(
    val title: String,
    val content: String,
    val noticeType: NoticeClass
)
