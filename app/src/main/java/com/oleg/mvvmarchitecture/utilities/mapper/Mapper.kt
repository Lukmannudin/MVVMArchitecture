package com.oleg.mvvmarchitecture.utilities.mapper

interface Mapper<I, O> {
    fun map(input: I): O
}