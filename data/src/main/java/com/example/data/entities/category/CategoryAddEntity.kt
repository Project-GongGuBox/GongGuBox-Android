package com.example.data.entities.category

import com.google.gson.annotations.SerializedName

data class CategoryAddEntity(
    @SerializedName("categoryName") val category: String,
    @SerializedName("parentCategoryName") val parentCategory: String
)
