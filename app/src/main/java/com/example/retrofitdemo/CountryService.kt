package com.example.retrofitdemo

import retrofit2.Call
import retrofit2.http.GET

interface CountryService {
    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}
