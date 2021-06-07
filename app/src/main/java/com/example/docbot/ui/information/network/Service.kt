package com.example.docbot.ui.information.network

import com.example.docbot.data.ListInformation
import retrofit2.Call
import retrofit2.http.GET

interface Service {
    @GET("covidinfo/article")
    fun getCovidInfo(): Call<ListInformation>
}