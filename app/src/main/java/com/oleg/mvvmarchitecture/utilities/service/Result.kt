package com.oleg.mvvmarchitecture.utilities.service

sealed class Result<T> {

    data class Success<T>(val results: T)

    data class Failure<T>(val throwable: Throwable) : Result<T>()

}