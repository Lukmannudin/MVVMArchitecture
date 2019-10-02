package com.oleg.mvvmarchitecture.utilities.service.webservice

import com.oleg.mvvmarchitecture.data.source_movie.remote.MovieRemote
import com.oleg.mvvmarchitecture.data.source_movie.remote.ResultMovie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("/3/movie/now_playing")
    suspend fun getNowPlaying(@Query("api_key") apikey: String): Response<ResultMovie<MovieRemote>>
}