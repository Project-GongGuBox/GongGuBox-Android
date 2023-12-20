package com.example.model.notice


/* TODO("Is that Right? Need to Check Attribute Naming") */
data class NoticeEntity(
    val noticeId: Long,
    val title: String,
    val content: String,
    val noticeType: NoticeClass
)
