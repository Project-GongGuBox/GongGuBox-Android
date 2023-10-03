package com.example.data.api

import com.example.data.entities.item.ItemCreateEntity
import com.example.data.entities.item.ItemEntity
import com.example.data.entities.item.ItemUpdateEntity
import com.example.data.entities.member.MemberEntity
import com.example.data.entities.member.MemberJoinEntity
import com.example.data.entities.member.MemberLogInEntity
import com.example.data.entities.member.MemberUpdateEntity
import com.example.data.entities.notice.NoticeCreateEntity
import com.example.data.entities.notice.NoticeEntity
import com.example.data.entities.order.OrderListPostEntity
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Query

interface GongGuBoxAPIService {
    /* OAuth Controller
    *   - TODO("Is that right?, authResultCode into Query?")
    * */
    @GET("/oauth2/code/kakao")
    suspend fun kakaoLogIn(@Query("code") authResultCode: String): Response<Void>

    @GET("/oauth2/code/google")
    suspend fun googleLogIn(@Query("code") authResultCode: String): Response<Void>

    /* Member Controller */
    @POST("/member/join")
    suspend fun joinMember(@Body joinMemberEntity: MemberJoinEntity): Response<Void>

    @POST("/member/login")
    suspend fun logInMember(@Body logInMemberEntity: MemberLogInEntity): Response<Void>

    @PATCH("/member/updateMember")
    suspend fun updateMember(
        @Header("Authorization") accessToken: String,
        @Body updateMemberEntity: MemberUpdateEntity
    ): Response<Void>

    /**
     * TODO("Ask This API Function because of there's no parameters")
     * */
    @GET("/member/getMemberById")
    suspend fun getMemberByID(@Header("Authorization") accessToken: String): Response<MemberEntity>

    @GET("/member/getMemberByEmail")
    suspend fun getMemberByEmail(
        @Header("Authorization") accessToken: String,
        @Query("email") email: String
    ): Response<MemberEntity>

    /**
     * TODO("Ask This API Function because of there's no parameters")
     * */
    @DELETE("/member/deleteMember")
    suspend fun deleteMember(@Header("Authorization") accessToken: String): Response<Void>


    /* Order Controller */
    @POST("/order/createOrder")
    suspend fun createOrder(
        @Header("Authorization") accessToken: String,
        @Body orderItemList: OrderListPostEntity
    ): Response<Void>

    @GET("/order/getOrder")
    suspend fun getOrder(
        @Header("Authorization") accessToken: String,
        @Query("orderId") orderID: Int
    ): Response<Void>

    @DELETE("/order/deleteOrder")
    suspend fun deleteOrder(
        @Header("Authorization") accessToken: String,
        @Query("orderId") orderID: Int
    ): Response<Void>

    /* Notice Controller */
    @POST("/notice/createNotice")
    suspend fun createNotice(
        @Header("Authorization") accessToken: String,
        @Body noticeItem: NoticeCreateEntity
    ): Response<Void>

    @GET("/notice/getNotice")
    suspend fun getNotice(
        @Header("Authorization") accessToken: String,
        @Query("noticeId") noticeID: Int
    ): Response<NoticeEntity>

    @PATCH("/notice/updateNotice")
    suspend fun updateNotice(
        @Header("Authorization") accessToken: String,
        @Body noticeItem: NoticeEntity
    ): Response<Void>

    @DELETE("/notice/deleteNotice")
    suspend fun deleteNotice(
        @Header("Authorization") accessToken: String,
        @Query("noticeId") noticeID: Int
    ): Response<Void>

    /* Item Controller */
    @POST("/item/createItem")
    suspend fun createItem(
        @Header("Authorization") accessToken: String,
        @Body itemEntity: ItemCreateEntity
    ): Response<Void>

    @GET("/item/getItem")
    suspend fun getItem(
        @Header("Authorization") accessToken: String,
        @Query("itemId") itemID: Int
    ): Response<ItemEntity>

    @PATCH("/item/updateItem")
    suspend fun updateItem(
        @Header("Authorization") accessToken: String,
        @Body itemUpdateEntity: ItemUpdateEntity
    ): Response<Void>

    @DELETE("/item/deleteItem")
    suspend fun deleteItem(
        @Header("Authorization") accessToken: String,
        @Query("itemId") itemID: Int
    ): Response<Void>

    /* Category Controller */

}