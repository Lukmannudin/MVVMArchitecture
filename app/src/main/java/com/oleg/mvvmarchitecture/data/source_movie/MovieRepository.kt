package com.oleg.mvvmarchitecture.data.source_movie

import com.oleg.mvvmarchitecture.data.Movie
import com.oleg.mvvmarchitecture.data.source_movie.remote.MovieRemote

interface MovieRepository {

    suspend fun getNowPlayingMovie(): List<Movie>

    fun mapNowPlayingMovie(movies: List<MovieRemote>): List<Movie>

}