package com.example.agromart.network

import com.example.agromart.model.product.ProductRequest
import com.example.agromart.model.product.ProductResponse
import com.example.agromart.model.user.UserDetailResponse
import com.example.agromart.model.user.UserRequest
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface CrudApiInterface {
    @POST("editUserProfile")
    suspend fun editUser(@Body userRequest: UserRequest): Call<UserDetailResponse>

    @POST("addProduct")
    suspend fun addProduct(@Body productRequest: ProductRequest): Call<ProductResponse>
}