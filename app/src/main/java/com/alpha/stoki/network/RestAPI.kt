package com.alpha.stoki.network
import com.alpha.stoki.data.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit: Retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val apiService: IStockApiService = retrofit.create(IStockApiService::class.java)

