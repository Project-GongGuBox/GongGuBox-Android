package com.example.network.retrofit

import com.example.model.category.CategoryAddEntity
import com.example.model.category.CategoryUpdateEntity
import com.example.model.item.ItemCreateEntity
import com.example.model.item.ItemEntity
import com.example.model.item.ItemUpdateEntity
import com.example.model.member.MemberEntity
import com.example.model.member.MemberJoinEntity
import com.example.model.member.MemberLogInEntity
import com.example.model.member.MemberUpdateEntity
import com.example.model.notice.NoticeCreateEntity
import com.example.model.notice.NoticeEntity
import com.example.model.order.OrderListPostEntity
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
    @GET("oauth/code/kakao")
    suspend fun kakaoLogIn(@Query("code") authResultCode: String): Response<Void>

    @GET("oauth/code/google")
    suspend fun googleLogIn(@Query("code") authResultCode: String): Response<Void>

    @POST("member/join")
    suspend fun joinMember(@Body joinMemberEntity: MemberJoinEntity): Response<Void>

    @POST("member/login")
    suspend fun logInMember(@Body logInEntity: MemberLogInEntity): Response<Void>

    @PATCH("member/updateMember")
    suspend fun updateMember(
        @Header("Authorization") accessToken: String,
        @Body updateMemberEntity: MemberUpdateEntity
    ): Response<Void>

    @GET("member/getMemberById")
    suspend fun getMemberByID(@Header("Authorization") accessToken: String): Response<MemberEntity>

    @GET("member/getMemberByEmail")
    suspend fun getMemberByEmail(
        @Header("Authorization") accessToken: String,
        @Query("email") email: String
    ): Response<MemberEntity>

    @DELETE("member/deleteMember")
    suspend fun deleteMember(@Header("Authorization") accessToken: String): Response<Void>


    /* Order Controller */
    @POST("order/createOrder")
    suspend fun createOrder(
        @Header("Authorization") accessToken: String,
        @Body orderItemList: OrderListPostEntity
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
        @Body noticeItem: NoticeCreateEntity
    ): Response<Void>

    @GET("notice/getNotice")
    suspend fun getNotice(
        @Header("Authorization") accessToken: String,
        @Query("noticeId") noticeID: Int
    ): Response<NoticeEntity>

    @PATCH("notice/updateNotice")
    suspend fun updateNotice(
        @Header("Authorization") accessToken: String,
        @Body noticeItem: NoticeEntity
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
        @Body itemEntity: ItemCreateEntity
    ): Response<Void>

    @GET("item/getItem")
    suspend fun getItem(
        @Header("Authorization") accessToken: String,
        @Query("itemId") itemID: Int
    ): Response<ItemEntity>

    @PATCH("item/updateItem")
    suspend fun updateItem(
        @Header("Authorization") accessToken: String,
        @Body itemUpdateEntity: ItemUpdateEntity
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
        @Body categoryAddEntity: CategoryAddEntity
    ): Response<Void>

    @PATCH("category/updateCategory")
    suspend fun updateCategory(
        @Header("Authorization") accessToken: String,
        @Body categoryUpdateEntity: CategoryUpdateEntity
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