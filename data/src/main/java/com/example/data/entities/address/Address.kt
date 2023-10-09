package com.example.data.entities.address

import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("city") val city: String,
    @SerializedName("street") val street: String,
    @SerializedName("zipcode") val zipCode: String
)