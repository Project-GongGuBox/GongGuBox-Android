package com.example.data.entities.order

import com.google.gson.annotations.SerializedName

data class OrderListPostEntity(
    @SerializedName("orderItemPostDtoList") val orderItemList: List<OrderItemPostEntity>
)
