package com.example.domain.repository

import kotlinx.coroutines.flow.Flow

/**
 * Order-Controller API function Repository
 */
interface OrderControllerRepos {
    fun createOrder(): Flow<Result<Unit>>

    fun getOrder()

    fun deleteOrder(): Flow<Unit>
}