package com.njeguski.weather.service

import com.njeguski.weather.Forecast
import com.njeguski.weather.Utills
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service    {

    @GET("forecast?")
    fun getCurrentWeather(
        @Query("lat")
        lat: String,
        @Query("lan")
        lon: String,
        @Query("appid")
        appid: String = Utills.API_KEY

    ): Call<Forecast>

    @GET("forecast?")
    fun getCurrentWeather(
        @Query("q")
        q : String,
        @Query("appid")
        appid: String = Utills.API_KEY

    ): Call<Forecast>
}