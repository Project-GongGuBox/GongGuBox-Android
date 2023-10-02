package com.example.domain.repository

import com.example.domain.model.MemberJoinModel
import com.example.domain.model.MemberLogInModel
import kotlinx.coroutines.flow.Flow

/**
 * Member-Controller API Functions Repository
 * */
interface MemberControllerRepos {

    fun joinMember(memberJoinModel: MemberJoinModel): Flow<Result<Unit>>

    fun logInMember(memberLogInModel: MemberLogInModel): Flow<Result<Unit>>

}