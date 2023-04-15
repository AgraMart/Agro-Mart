package com.example.agromart.network

import com.example.agromart.model.auth.PhoneAuthRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiInterface {
    @POST("sendOTP")
    fun sendOTP(@Body phoneAuthRequest: PhoneAuthRequest)
}