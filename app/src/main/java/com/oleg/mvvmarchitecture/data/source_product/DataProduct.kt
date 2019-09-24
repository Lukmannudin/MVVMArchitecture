package com.oleg.mvvmarchitecture.data.source_product

import com.oleg.mvvmarchitecture.data.source_product.remote.NetworkProduct

data class DataProduct (
    val networkProduct: NetworkProduct,
    val isFavorite: Boolean
)