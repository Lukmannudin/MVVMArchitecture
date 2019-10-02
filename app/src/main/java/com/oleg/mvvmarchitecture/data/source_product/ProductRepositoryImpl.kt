//package com.oleg.mvvmarchitecture.data.source_product
//
//class ProductRepositoryImpl(
//    private val productApiService: ProductApiService,
//    private val productDataMapper: Mapper<DataProduct, Product>,
//    private val productReferences: ProductReferences
//) : ProductRepository {
//    override fun getWishlist(): Single<Result<List<Product>>> {
//        return productApiService.getWishlist(productReferences.getFavorite()).map {
////            when (it) {
////                is Result.Success -> Result.Success(mapWishlist(it.results))
////                is Result.Failure -> Result.Failure<List<Product>>(it.throwable)
////            }
//        }
//    }
//
//    override fun mapWishlist(wishlist: List<NetworkProduct>): List<Product> {
//        return wishlist.map {
//            productDataMapper.map(DataProduct(it,true))
//        }
//    }
//
//}