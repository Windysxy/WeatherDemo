package com.example.weatherdemo.logic.network

import com.example.weatherdemo.WeatherApplication
import com.example.weatherdemo.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceRequest {
    @GET("v2/place?token=${WeatherApplication.Token}&lang=zh_CN")
    fun sendPlaceRequest(@Query("query") query: String): Call<PlaceResponse>
}