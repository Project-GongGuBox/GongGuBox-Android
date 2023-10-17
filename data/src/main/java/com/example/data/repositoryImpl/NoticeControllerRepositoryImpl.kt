package com.example.data.repositoryImpl

import com.example.domain.repository.NoticeControllerRepos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoticeControllerRepositoryImpl @Inject constructor(

): NoticeControllerRepos {
    override fun createNotice(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun getNotice() {
        TODO("Not yet implemented")
    }

    override fun updateNotice(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun deleteNotice(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }
}