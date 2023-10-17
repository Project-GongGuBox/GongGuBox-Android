package com.example.data.repositoryImpl

import com.example.domain.repository.ItemControllerRepos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ItemControllerRepositoryImpl @Inject constructor(

): ItemControllerRepos {
    override fun createItem(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun getItem() {
        TODO("Not yet implemented")
    }

    override fun updateItem(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun deleteItem(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }
}