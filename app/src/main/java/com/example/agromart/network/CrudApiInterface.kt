package com.example.agromart.network

import com.example.agromart.model.product.ItemListResponse
import com.example.agromart.model.product.ProductRequest
import com.example.agromart.model.product.ProductResponse
import com.example.agromart.model.user.DataRe
import com.example.agromart.model.user.UserDetailResponse
import com.example.agromart.model.user.UserRequest
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.POST

interface CrudApiInterface {
    @POST("editUserProfile")
    fun editUser(
        @Body userRequest: DataRe,
        @HeaderMap header: Map<String, String>
    ): Call<UserDetailResponse>

    @POST("addProduct")
    fun addProduct(
        @Body productRequest: ProductRequest,
        @HeaderMap header: Map<String, String>
    ): Call<ProductResponse>

    @GET("showAllItems")
    suspend fun showAllItems(): Response<ItemListResponse>

    @GET("getProfile")
    fun showAllItems(
        @HeaderMap header: Map<String, String>
    ): Response<ItemListResponse>

    @GET("news")
    fun getNews(
        @HeaderMap header: Map<String, String>
    ): Response<ItemListResponse>
}