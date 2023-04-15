package com.example.agromart.model.user

data class UserDetailResponse(
    val message: String = "",
    val data: Data = Data()
)

data class Data(
    val _id: String = "",
    val phone: String = "",
    val userType: String = "",
    val productsListed: List<Any?> = listOf(),
    val createdAt: String = "",
    val updatedAt: String = "",
    val aadhar: String = "",
    val dob: String = "",
    val gender: String = "",
    val name: String = ""
)
