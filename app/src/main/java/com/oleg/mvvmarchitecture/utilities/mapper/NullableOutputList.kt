package com.oleg.mvvmarchitecture.utilities.mapper

// Non-nullable to nullable
interface NullableOutputListMapper<I,O>: Mapper<List<I>, List<O>?>

class NullableOutputListMapperImpl<I,O>(
    private val mapper: Mapper<I,O>
) : NullableOutputListMapper<I,O> {

    override fun map(input: List<I>): List<O>? {
        return if (input.isEmpty()) null else input.map { mapper.map(it) }
    }

}