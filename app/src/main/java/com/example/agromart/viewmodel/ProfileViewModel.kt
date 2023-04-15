package com.example.agromart.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.agromart.model.Location
import com.example.agromart.model.Weather
import com.example.agromart.model.user.UserDetailResponse
import com.example.agromart.model.user.UserRequest
import com.example.agromart.network.ApiInterface
import com.example.agromart.network.CrudApiInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(val retrofit: Retrofit) : ViewModel() {
    private val _userDetailResponse: MutableStateFlow<UserDetailResponse> = MutableStateFlow(
        UserDetailResponse()
    )
    val userDetailResponse: StateFlow<UserDetailResponse> get() = _userDetailResponse

    private val _userDetailRequest: MutableStateFlow<UserRequest> = MutableStateFlow(
        UserRequest()
    )
    val userDetailRequest: StateFlow<UserRequest> get() = _userDetailRequest
    fun editData() {
        val api = retrofit.create(CrudApiInterface::class.java)
        viewModelScope.launch {
            val response = api.editUser(UserRequest())
            response.enqueue(object : Callback<UserDetailResponse> {
                override fun onResponse(
                    call: Call<UserDetailResponse>,
                    response: Response<UserDetailResponse>
                ) {
                    _userDetailResponse.value = response.body() ?: UserDetailResponse()
                }

                override fun onFailure(call: Call<UserDetailResponse>, t: Throwable) {
                    Log.d("Error", "fetchWeather: ${t.message}")
                }
            })
        }
    }

    fun onUserRequestChanged(userRequest: UserRequest) {
        _userDetailRequest.value = userRequest
    }
}