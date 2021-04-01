package com.hympyt.weatherapi.weather_list

import com.hympyt.weatherapi.models.Weather
import com.hympyt.weatherapi.models.WeatherList


interface WeatherListContract {

    interface Model {

        interface OnFinishedListener {

            fun onSuccess(weather: List<WeatherList>?)
            fun onFailure(t: Throwable)
        }

        fun getWeatherList(onFinishedListener: OnFinishedListener)
    }

    interface View {

        fun showProgress()
        fun hideProgress()
        fun submitWeather(weather: List<WeatherList>?)
        fun showError(t: Throwable)
    }

    interface Presenter {

        fun getWeather()
    }

}