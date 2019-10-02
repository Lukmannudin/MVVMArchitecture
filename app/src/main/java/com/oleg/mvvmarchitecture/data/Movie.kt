package com.oleg.mvvmarchitecture.data

data class Movie(

    val id: Int = -1,

    val overview: String = "",

    val originalLanguage: String = "",

    val originalTitle: String = "",

    val video: Boolean = false,

    val title: String = "",

    val genreIds: List<Int?> = mutableListOf(),

    val posterPath: String = "",

    val backdropPath: String = "",

    val releaseDate: String = "",

    val popularity: Double = .0,

    val voteAverage: Double = .0,

    val adult: Boolean = false,

    val voteCount: Int = 0
)