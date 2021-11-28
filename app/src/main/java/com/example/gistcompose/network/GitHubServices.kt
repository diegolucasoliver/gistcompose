package com.example.gistcompose.network

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface GitHubServices {

    @Headers("user-agent: request")
    @GET("/gists/public")
    fun getGistList(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    )
}