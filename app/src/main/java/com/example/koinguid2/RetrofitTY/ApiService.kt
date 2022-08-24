package com.example.koinguid2.RetrofitTY

import retrofit2.http.GET

interface ApiService {

    companion object{
        const val Base_URL = "http://google.com"
    }

    @GET("/post")
    suspend fun getPost():List<Post>
}