package com.example.agromart.repository.impl

import android.app.Application
import android.util.Log
import com.example.agromart.model.Location
import com.example.agromart.model.Weather
import com.example.agromart.network.ApiInterface
import com.example.agromart.repository.HomeRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    val appContext: Application,
    val retrofit: Retrofit
) : HomeRepository {

}