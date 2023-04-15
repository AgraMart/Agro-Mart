package com.example.agromart.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.agromart.model.Location
import com.example.agromart.model.Weather
import com.example.agromart.network.ApiInterface
import com.example.agromart.network.CrudApiInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

@HiltViewModel
class BuyingViewModel @Inject constructor(val retrofit: Retrofit) : ViewModel() {
    fun getItemDetail(){
        val api = retrofit.create(CrudApiInterface::class.java)
        viewModelScope.launch {
            val response = api.showAllItems()
            response.enqueue(object : Callback<Weather> {
                override fun onResponse(call: Call<Weather>, response: Response<Weather>) {
                    _weather.value = response.body()?: Weather()
                }
                override fun onFailure(call: Call<Weather>, t: Throwable) {
                    Log.d("Error", "fetchWeather: ${t.message}")
                }

            })
        }
    }
}