package com.example.data.repositoryImpl

import com.example.domain.model.MemberJoinModel
import com.example.domain.model.MemberLogInModel
import com.example.domain.repository.MemberControllerRepos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MemberControllerRepositoryImpl @Inject constructor(

): MemberControllerRepos {
    override fun joinMember(memberJoinModel: MemberJoinModel): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun logInMember(memberLogInModel: MemberLogInModel): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun updateMember(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }

    override fun getMemberById() {
        TODO("Not yet implemented")
    }

    override fun getMemberByEmail() {
        TODO("Not yet implemented")
    }

    override fun deleteMember(): Flow<Result<Unit>> {
        TODO("Not yet implemented")
    }
}