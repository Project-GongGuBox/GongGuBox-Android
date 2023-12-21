package com.example.network

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

interface GongGuBoxDataSource {
    /* Member Controller */
    suspend fun getKaKaoLogIn(code: String): Result<Unit>

    suspend fun getGoogleLogIn(code: String): Result<Unit>

    suspend fun joinMember(joinEntity: MemberJoinEntity): Result<Unit>

    suspend fun logInMember(logInEntity: MemberLogInEntity): Result<Unit>

    suspend fun updateMember(accessToken: String, updateEntity: MemberUpdateEntity): Result<Unit>

    suspend fun getMemberByID(accessToken: String): MemberEntity?

    suspend fun getMemberByEmail(accessToken: String, email: String): MemberEntity?

    suspend fun deleteMember(accessToken: String): Result<Unit>

    /* Order Controller */
    suspend fun createOrder(accessToken: String, orderList: OrderListPostEntity): Result<Unit>

    suspend fun getOrder(accessToken: String, orderId: Int): Result<Unit>

    suspend fun deleteOrder(accessToken: String, orderId: Int): Result<Unit>

    /* Notice Controller */
    suspend fun createNotice(accessToken: String, noticeCreateEntity: NoticeCreateEntity): Result<Unit>

    suspend fun getNotice(accessToken: String, noticeId: Int): NoticeEntity?

    suspend fun updateNotice(accessToken: String, noticeEntity: NoticeEntity): Result<Unit>

    suspend fun deleteNotice(accessToken: String, noticeId: Int): Result<Unit>

    /* Item(Goods) Controller */
    suspend fun createItem(accessToken: String, itemCreateEntity: ItemCreateEntity): Result<Unit>

    suspend fun getItem(accessToken: String, itemId: Int): ItemEntity?

    suspend fun updateItem(accessToken: String, itemUpdateEntity: ItemUpdateEntity): Result<Unit>

    suspend fun deleteItem(accessToken: String, itemId: Int): Result<Unit>

    /* Category Controller */
    suspend fun getCategoryByName()

    suspend fun getCategoryById()

    suspend fun deleteCategory()

    /* Cart Controller */
    suspend fun addItemInToCart()

    suspend fun updateItemCountInCart()

    suspend fun clearItemInCart()

    suspend fun getCartItems()

    suspend fun deleteItemInCart()
}