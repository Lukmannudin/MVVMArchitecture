package com.oleg.mvvmarchitecture.utilities.service

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.oleg.mvvmarchitecture.BuildConfig
import com.oleg.mvvmarchitecture.utilities.service.webservice.MovieService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {
    private val client = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val movieService: MovieService = client.create(MovieService::class.java)
}
