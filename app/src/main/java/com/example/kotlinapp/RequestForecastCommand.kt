package com.example.kotlinapp

/**
 * Created by Anand on 10/06/2017.
 */
class RequestForecastCommand(val zipCode: String) : Command<DomainClasses.ForecastList> {

    override fun execute(): DomainClasses.ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}