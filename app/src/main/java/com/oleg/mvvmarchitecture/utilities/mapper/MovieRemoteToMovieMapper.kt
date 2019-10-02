package com.oleg.mvvmarchitecture.utilities.mapper

import com.oleg.mvvmarchitecture.data.Movie
import com.oleg.mvvmarchitecture.data.source_movie.remote.MovieRemote

class MovieRemoteToMovieMapper : Mapper<MovieRemote, Movie> {
    override fun map(input: MovieRemote): Movie {
        return Movie(
            input.id!!,
            input.overview!!,
            input.originalLanguage!!,
            input.originalTitle!!,
            input.video!!,
            input.title!!,
            input.genreIds!!,
            input.posterPath!!,
            input.backdropPath!!,
            input.releaseDate!!,
            input.popularity!!,
            input.voteAverage!!,
            input.adult!!,
            input.voteCount!!

        )
    }
}