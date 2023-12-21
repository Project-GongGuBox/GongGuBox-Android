package com.example.network.retrofit

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
import com.example.network.GongGuBoxDataSource
import okhttp3.OkHttpClient
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

private const val GONG_GU_BOX_BASE_URL = "https://www.gonggubox.shop/"

@Singleton
class GongGuBoxAPIRetrofit @Inject constructor(
    okHttpClient: OkHttpClient
): GongGuBoxDataSource {
    private val gongGuBoxServiceClient = Retrofit.Builder()
        .baseUrl(GONG_GU_BOX_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GongGuBoxAPIService::class.java)

    /* Member Controller */
    override suspend fun getKaKaoLogIn(code: String): Result<Unit> {
        val response = gongGuBoxServiceClient.kakaoLogIn(code)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun getGoogleLogIn(code: String): Result<Unit> {
        val response = gongGuBoxServiceClient.googleLogIn(code)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun joinMember(joinEntity: MemberJoinEntity): Result<Unit> {
        val response = gongGuBoxServiceClient.joinMember(joinEntity)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun logInMember(logInEntity: MemberLogInEntity): Result<Unit> {
        val response = gongGuBoxServiceClient.logInMember(logInEntity)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun updateMember(
        accessToken: String,
        updateEntity: MemberUpdateEntity
    ): Result<Unit> {
        val response = gongGuBoxServiceClient.updateMember(accessToken, updateEntity)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun getMemberByID(accessToken: String): MemberEntity? {
        val response = gongGuBoxServiceClient.getMemberByID(accessToken)

        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }

    override suspend fun getMemberByEmail(accessToken: String, email: String): MemberEntity? {
        val response = gongGuBoxServiceClient.getMemberByEmail(accessToken, email)

        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }

    override suspend fun deleteMember(accessToken: String): Result<Unit> {
        val response = gongGuBoxServiceClient.deleteMember(accessToken)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    /* Order Controller */
    override suspend fun createOrder(
        accessToken: String,
        orderList: OrderListPostEntity
    ): Result<Unit> {
        val response = gongGuBoxServiceClient.createOrder(accessToken, orderList)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun getOrder(accessToken: String, orderId: Int): Result<Unit> {
        val response = gongGuBoxServiceClient.getOrder(accessToken, orderId)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun deleteOrder(accessToken: String, orderId: Int): Result<Unit> {
        val response = gongGuBoxServiceClient.deleteOrder(accessToken, orderId)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    /* Notice Controller */
    override suspend fun createNotice(
        accessToken: String,
        noticeCreateEntity: NoticeCreateEntity
    ): Result<Unit> {
        val response = gongGuBoxServiceClient.createNotice(accessToken, noticeCreateEntity)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun getNotice(accessToken: String, noticeId: Int): NoticeEntity? {
        val response = gongGuBoxServiceClient.getNotice(accessToken, noticeId)

        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }

    override suspend fun updateNotice(
        accessToken: String,
        noticeEntity: NoticeEntity
    ): Result<Unit> {
        val response = gongGuBoxServiceClient.updateNotice(accessToken, noticeEntity)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun deleteNotice(accessToken: String, noticeId: Int): Result<Unit> {
        val response = gongGuBoxServiceClient.deleteNotice(accessToken, noticeId)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    /* Item Controller  */
    override suspend fun createItem(
        accessToken: String,
        itemCreateEntity: ItemCreateEntity
    ): Result<Unit> {
        val response = gongGuBoxServiceClient.createItem(accessToken, itemCreateEntity)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun getItem(accessToken: String, itemId: Int): ItemEntity? {
        val response = gongGuBoxServiceClient.getItem(accessToken, itemId)

        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }

    override suspend fun updateItem(
        accessToken: String,
        itemUpdateEntity: ItemUpdateEntity
    ): Result<Unit> {
        val response = gongGuBoxServiceClient.updateItem(accessToken, itemUpdateEntity)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    override suspend fun deleteItem(accessToken: String, itemId: Int): Result<Unit> {
        val response = gongGuBoxServiceClient.deleteItem(accessToken, itemId)

        return if (response.isSuccessful) {
            Result.success(Unit)
        } else {
            Result.failure(HttpException(response))
        }
    }

    /* TODO("Category & Cart Controller Not yet implemented") */
    override suspend fun getCategoryByName() {
        TODO("Not yet implemented")
    }

    override suspend fun getCategoryById() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteCategory() {
        TODO("Not yet implemented")
    }

    override suspend fun addItemInToCart() {
        TODO("Not yet implemented")
    }

    override suspend fun updateItemCountInCart() {
        TODO("Not yet implemented")
    }

    override suspend fun clearItemInCart() {
        TODO("Not yet implemented")
    }

    override suspend fun getCartItems() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteItemInCart() {
        TODO("Not yet implemented")
    }
}