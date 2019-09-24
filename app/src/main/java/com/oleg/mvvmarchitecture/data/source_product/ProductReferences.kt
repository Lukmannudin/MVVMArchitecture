package com.oleg.mvvmarchitecture.data.source_product

interface ProductReferences {

    fun isFavorite(id: String?): Boolean

    fun getFavorite() : List<String>

}