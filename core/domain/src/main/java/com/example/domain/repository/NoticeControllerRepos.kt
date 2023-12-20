package com.example.domain.repository

import kotlinx.coroutines.flow.Flow

/**
 * Notice-Controller API function Repository
 */
interface NoticeControllerRepos {
    fun createNotice(): Flow<Result<Unit>>

    fun getNotice()

    fun updateNotice(): Flow<Result<Unit>>

    fun deleteNotice(): Flow<Result<Unit>>
}