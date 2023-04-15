package com.example.agromart.network

import com.example.agromart.model.Location
import com.example.agromart.model.user.UserDetailResponse
import com.example.agromart.model.user.UserRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface MapApiInterface {
    @POST("mapNearby")
    suspend fun mapNearBy(@Body location: Location): Call<UserDetailResponse>
}