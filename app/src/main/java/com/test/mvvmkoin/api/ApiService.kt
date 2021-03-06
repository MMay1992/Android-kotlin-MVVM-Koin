package com.test.mvvmkoin.api

import com.test.mvvmkoin.api.model.BaseResponse
import com.test.mvvmkoin.vo.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("5e2722ff2f00004a00a4fa09")
    fun getNewsList(): Call<BaseResponse<List<NewsResponse>>>

}