package com.example.prova3.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val URL = "https://apiv2.radiola.app/v1/"

    private val retrofit =
        Retrofit.Builder().baseUrl(URL)
            .addConverterFactory(
                GsonConverterFactory
                    .create()
            ).build()


    fun serviceMusic(): MusicService {
        return retrofit.create(MusicService::class.java)
    }
}