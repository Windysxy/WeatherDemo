package com.example.weatherdemo

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

//提供全局context

class WeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val Token = ""
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}