package com.example.data.entities.order

import com.google.gson.annotations.SerializedName

data class OrderItemPostEntity(
    @SerializedName("itemId") val orderItemID: Int,
    @SerializedName("count") val orderItemCount: Int
)
