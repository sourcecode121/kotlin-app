package com.example.kotlinapp

import android.util.Log
import java.net.URL

/**
 * Created by Anand on 20/03/2017.
 */
class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}