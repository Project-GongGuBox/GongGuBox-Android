package com.example.model.category

data class CategoryUpdateEntity(
    val categoryId: Int,
    val categoryName: String,
    val parentCategoryName: String,
    val childCategoryListNameList: List<String>
)
