package com.oleg.mvvmarchitecture.data.source_movie.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Movies")
data class DBMovie(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "overview")
    val overview: String,

    @ColumnInfo(name = "originalLanguage")
    val originalLanguage: String,

    @ColumnInfo(name = "originalTitle")
    val originalTitle: String,

    @ColumnInfo(name = "video")
    val video: Boolean,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "genreIds")
    val genreIds: List<Int>,

    @ColumnInfo(name = "posterPath")
    val posterPath: String,

    @ColumnInfo(name = "backdropPath")
    val backdropPath: String,

    @ColumnInfo(name = "releaseDate")
    val releaseDate: String,

    @ColumnInfo(name = "popularity")
    val popularity: Double,

    @ColumnInfo(name = "voteAverage")
    val voteAverage: Double,

    @ColumnInfo(name = "adult")
    val adult: Boolean,

    @ColumnInfo(name = "voteCount")
    val voteCount: Int
)