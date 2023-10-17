package com.example.data.repositoryImpl

import com.example.domain.repository.OrderControllerRepos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OrderControllerRepositoryImpl @Inject constructor(

): OrderControllerRepos {
    override fun createOrder(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun getOrder() {
        TODO("Not yet implemented")
    }

    override fun deleteOrder(): Flow<Unit> {
        TODO("Not yet implemented")
    }
}