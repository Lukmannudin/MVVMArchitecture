package com.oleg.mvvmarchitecture.utilities.service

import com.oleg.mvvmarchitecture.data.source_product.remote.NetworkProduct
import io.reactivex.Single

interface ProductApiService {

    fun getProducts(): Single<Result<List<NetworkProduct>>>

    fun getWishlist(productIds: List<String>): Single<Result<List<NetworkProduct>>>

}