package com.example.agromart.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Retrofit
import javax.inject.Inject

@HiltViewModel
class ProductDescriptionSellerViewModel @Inject constructor(
    val retrofit: Retrofit
) : ViewModel() {

}