package com.jb.mvvmdesign.api

class WebServiceRequests {

    val apiService by lazy { ApiClient.getClient()!!.create(ApiService::class.java) }

//    suspend fun mRequestPayment(
//        mRequestPayment: RequestPayment
//    ) = apiService.signUp(mRequestPayment)


}
