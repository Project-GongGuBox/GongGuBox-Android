package com.example.data.repositoryImpl

import com.example.domain.repository.CategoryControllerRepos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoryControllerRepositoryImpl @Inject constructor(

): CategoryControllerRepos {
    override fun addCategory(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun updateCategory(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun getCategoryByName() {
        TODO("Not yet implemented")
    }

    override fun getCategoryById() {
        TODO("Not yet implemented")
    }

    override fun deleteCategory() {
        TODO("Not yet implemented")
    }
}