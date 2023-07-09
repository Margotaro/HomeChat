package com.alpha.stoki.network
import com.alpha.stoki.data.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestAPI {
    companion object {
        val loggingInterceptor = LoggingInterceptor()
        private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(loggingInterceptor).build())
            .build()

        val apiService: IStockApiService = retrofit.create(IStockApiService::class.java)
    }
}