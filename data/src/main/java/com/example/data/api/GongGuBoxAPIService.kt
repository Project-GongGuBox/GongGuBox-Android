package com.example.data.api

import com.example.data.entities.JoinMemberEntity
import com.example.data.entities.LogInMemberEntity
import com.example.data.entities.UpdateMemberEntity
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Query

interface GongGuBoxAPIService {

    /* Member Controller */
    @POST("/member/join")
    suspend fun joinMember(@Body joinMemberEntity: JoinMemberEntity): Response<Void>

    @POST("/member/login")
    suspend fun logInMember(@Body logInMemberEntity: LogInMemberEntity): Response<Void>

    @PATCH("/member/updateMember")
    suspend fun updateMember(
        @Header("Authorization") accessToken: String,
        @Body updateMemberEntity: UpdateMemberEntity
    ): Response<Void>

    /**
     * TODO("Ask This API Function because of there's no parameters")
     * */
    @GET("/member/getMemberById")
    suspend fun getMemberByID(@Header("Authorization") accessToken: String): Response<Void>

    @GET("/member/getMemberByEmail")
    suspend fun getMemberByEmail(
        @Header("Authorization") accessToken: String,
        @Query("email") email: String
    ): Response<Void>

    /**
     * TODO("Ask This API Function because of there's no parameters")
     * */
    @DELETE("/member/deleteMember")
    suspend fun deleteMember(@Header("Authorization") accessToken: String): Response<Void>

    /* Order Controller */
    @GET("/order/getOrder")
    suspend fun getOrder(
        @Header("Authorization") accessToken: String,
        @Query("orderId") orderID: Int
    ): Response<Void>

    @POST("/order/createOrder")
    suspend fun createOrder()
}