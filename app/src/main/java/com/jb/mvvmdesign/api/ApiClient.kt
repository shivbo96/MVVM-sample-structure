package com.jb.mvvmdesign.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class ApiClient {
    companion object {
        private var retrofit: Retrofit? = null
        fun getClient(): Retrofit? {
            val client = OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl("Constants.BASE_URL")
                    .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build()
            }
            return retrofit
        }


    }


}