package com.example.kotlinapp

/**
 * Created by Anand on 10/06/2017.
 */
class DomainClasses {

    data class ForecastList(val city: String, val country: String,
                            val dailyForecast:List<Forecast>)

    data class Forecast(val date: String, val description: String, val high: Int,
                        val low: Int)

}