package com.example.domain.repository

import kotlinx.coroutines.flow.Flow

/**
 * Category-Controller API function Repository
 */
interface CategoryControllerRepos {
    fun addCategory(): Flow<Result<Unit>>

    fun updateCategory(): Flow<Result<Unit>>

    fun getCategoryByName()

    fun getCategoryById()

    fun deleteCategory()
}