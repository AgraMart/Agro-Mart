package com.example.agromart.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.agromart.model.product.ProductRequest
import com.example.agromart.model.product.ProductResponse
import com.example.agromart.model.user.UserDetailResponse
import com.example.agromart.model.user.UserRequest
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
class ProductViewModel @Inject constructor(val retrofit: Retrofit) : ViewModel() {
    private val _productRequest: MutableStateFlow<ProductRequest> = MutableStateFlow(
        ProductRequest()
    )
    val productRequest: StateFlow<ProductRequest> get() = _productRequest

    private val _productResponse: MutableStateFlow<ProductResponse> = MutableStateFlow(
        ProductResponse()
    )
    val productResponse: StateFlow<ProductResponse> get() = _productResponse

    fun addProduct() {
        val api = retrofit.create(CrudApiInterface::class.java)
        viewModelScope.launch {
            val response = api.addProduct(productRequest.value)
            response.enqueue(object : Callback<ProductResponse> {
                override fun onResponse(
                    call: Call<ProductResponse>,
                    response: Response<ProductResponse>
                ) {
                    _productResponse.value = response.body() ?: ProductResponse()
                }

                override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
                    Log.d("Error", "fetchWeather: ${t.message}")
                }
            })
        }
    }

    fun onProductRequestChanged(productRequest: ProductRequest) {
        _productRequest.value = productRequest
    }
}