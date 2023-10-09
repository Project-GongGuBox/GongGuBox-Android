package com.example.data.entities.category

import com.google.gson.annotations.SerializedName

data class CategoryUpdateEntity(
    @SerializedName("categoryId") val id: Int,
    @SerializedName("categoryName") val category: String,
    @SerializedName("parentCategoryName") val parentCategory: String,
    @SerializedName("childCategoryNameList") val childCategoryList: List<String>
)
