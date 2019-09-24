package com.oleg.mvvmarchitecture.data.source_product

import com.oleg.mvvmarchitecture.data.Product
import com.oleg.mvvmarchitecture.data.source_product.remote.NetworkProduct
import com.oleg.mvvmarchitecture.utilities.service.Result
import io.reactivex.Single

interface ProductRepository {

    fun getWishlist() : Single<Result<List<Product>>>

    fun mapWishlist(wishlist: List<NetworkProduct>) : List<Product>
}
