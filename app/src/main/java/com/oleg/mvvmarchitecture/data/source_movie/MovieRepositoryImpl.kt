package com.oleg.mvvmarchitecture.data.source_movie

import com.oleg.mvvmarchitecture.BuildConfig
import com.oleg.mvvmarchitecture.data.Movie
import com.oleg.mvvmarchitecture.data.source_movie.remote.MovieRemote
import com.oleg.mvvmarchitecture.utilities.mapper.NullableInputListMapperImpl
import com.oleg.mvvmarchitecture.utilities.service.webservice.MovieService

class MovieRepositoryImpl(
    private val movieService: MovieService,
    private val movieDataMapper: NullableInputListMapperImpl<MovieRemote, Movie>
) : MovieRepository {

    override fun mapNowPlayingMovie(movies: List<MovieRemote>): List<Movie> {
        return movieDataMapper.map(movies)
    }

    override suspend fun getNowPlayingMovie(): List<Movie> {
        return movieService.getNowPlaying(BuildConfig.API_KEY).body()?.results?.let {
            mapNowPlayingMovie(
                it
            )
        }!!
    }
}