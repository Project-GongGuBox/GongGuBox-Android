package com.example.data.api

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
    @GET("oauth2/code/kakao")
    suspend fun kakaoLogIn(@Query("code") authResultCode: String): Response<Void>

    @GET("oauth2/code/google")
    suspend fun googleLogIn(@Query("code") authResultCode: String): Response<Void>

    /* Member Controller */
    @POST("member/join")
    suspend fun joinMember(@Body joinMemberEntity: com.example.model.member.MemberJoinEntity): Response<Void>

    @POST("member/login")
    suspend fun logInMember(@Body logInMemberEntity: com.example.model.member.MemberLogInEntity): Response<Void>

    @PATCH("member/updateMember")
    suspend fun updateMember(
        @Header("Authorization") accessToken: String,
        @Body updateMemberEntity: com.example.model.member.MemberUpdateEntity
    ): Response<Void>

    /**
     * TODO("Ask This API Function because of there's no parameters")
     * */
    @GET("member/getMemberById")
    suspend fun getMemberByID(@Header("Authorization") accessToken: String): Response<com.example.model.member.MemberEntity>

    @GET("member/getMemberByEmail")
    suspend fun getMemberByEmail(
        @Header("Authorization") accessToken: String,
        @Query("email") email: String
    ): Response<com.example.model.member.MemberEntity>

    /**
     * TODO("Ask This API Function because of there's no parameters")
     * */
    @DELETE("member/deleteMember")
    suspend fun deleteMember(@Header("Authorization") accessToken: String): Response<Void>


    /* Order Controller */
    @POST("order/createOrder")
    suspend fun createOrder(
        @Header("Authorization") accessToken: String,
        @Body orderItemList: com.example.model.order.OrderListPostEntity
    ): Response<Void>

    @GET("order/getOrder")
    suspend fun getOrder(
        @Header("Authorization") accessToken: String,
        @Query("orderId") orderID: Int
    ): Response<Void>

    @DELETE("order/deleteOrder")
    suspend fun deleteOrder(
        @Header("Authorization") accessToken: String,
        @Query("orderId") orderID: Int
    ): Response<Void>

    /* Notice Controller */
    @POST("notice/createNotice")
    suspend fun createNotice(
        @Header("Authorization") accessToken: String,
        @Body noticeItem: com.example.model.notice.NoticeCreateEntity
    ): Response<Void>

    @GET("notice/getNotice")
    suspend fun getNotice(
        @Header("Authorization") accessToken: String,
        @Query("noticeId") noticeID: Int
    ): Response<com.example.model.notice.NoticeEntity>

    @PATCH("notice/updateNotice")
    suspend fun updateNotice(
        @Header("Authorization") accessToken: String,
        @Body noticeItem: com.example.model.notice.NoticeEntity
    ): Response<Void>

    @DELETE("notice/deleteNotice")
    suspend fun deleteNotice(
        @Header("Authorization") accessToken: String,
        @Query("noticeId") noticeID: Int
    ): Response<Void>

    /* Item Controller */
    @POST("item/createItem")
    suspend fun createItem(
        @Header("Authorization") accessToken: String,
        @Body itemEntity: com.example.model.item.ItemCreateEntity
    ): Response<Void>

    @GET("item/getItem")
    suspend fun getItem(
        @Header("Authorization") accessToken: String,
        @Query("itemId") itemID: Int
    ): Response<com.example.model.item.ItemEntity>

    @PATCH("item/updateItem")
    suspend fun updateItem(
        @Header("Authorization") accessToken: String,
        @Body itemUpdateEntity: com.example.model.item.ItemUpdateEntity
    ): Response<Void>

    @DELETE("item/deleteItem")
    suspend fun deleteItem(
        @Header("Authorization") accessToken: String,
        @Query("itemId") itemID: Int
    ): Response<Void>

    /* Category Controller */
    @POST("category/addCategory")
    suspend fun addCategory(
        @Header("Authorization") accessToken: String,
        @Body categoryAddEntity: com.example.model.category.CategoryAddEntity
    ): Response<Void>

    @PATCH("category/updateCategory")
    suspend fun updateCategory(
        @Header("Authorization") accessToken: String,
        @Body categoryUpdateEntity: com.example.model.category.CategoryUpdateEntity
    ): Response<Void>

    @GET("category/getCategoryByName")
    suspend fun getCategoryByName()

    @GET("category/getCategoryById")
    suspend fun getCategoryById()

    @DELETE("category/deleteCategory")
    suspend fun deleteCategory()

    /* Cart Controller */
    @POST("cart/addItemToCart")
    suspend fun addItemToCart()

    @PATCH("cart/updateItemCountInCart")
    suspend fun updateItemCntInCart()

    @PATCH("cart/clearCart")
    suspend fun clearCartItem()

    @GET("cart/getCart")
    suspend fun getCart()

    @DELETE("cart/deleteItemInCart")
    suspend fun deleteItemInCart()
}