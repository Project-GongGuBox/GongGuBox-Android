package com.example.domain.repository

import kotlinx.coroutines.flow.Flow

/**
 * Item-Controller API function Repository
 */
interface ItemControllerRepos {
    fun createItem(): Flow<Result<Unit>>

    fun getItem()

    fun updateItem(): Flow<Result<Unit>>

    fun deleteItem(): Flow<Result<Unit>>
}