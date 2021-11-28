package com.example.gistcompose.network

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServices {

    private const val BASE_URL = "https://api.github.com"

    fun service(): Retrofit =
        with(Retrofit.Builder()) {
            baseUrl(BASE_URL)
            addConverterFactory(GsonConverterFactory.create(Gson()))
            build()
        }
}