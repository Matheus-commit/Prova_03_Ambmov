package com.example.prova3.services

import com.example.prova3.models.Music
import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("playlist/top10")
    fun getMusic(): Call<List<Music>>
}