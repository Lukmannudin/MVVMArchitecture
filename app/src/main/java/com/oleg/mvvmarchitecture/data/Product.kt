package com.oleg.mvvmarchitecture.data


// Entity
data class Product(
    val id: String,
    val name: String,
    val price: String
) {
    // Value Object
    data class Price(
        val nowPrice: Double,
        val wasPrice: Double
    ) {
        companion object {
            val EMPTY = Price(0.0, 0.0)
        }
    }
}