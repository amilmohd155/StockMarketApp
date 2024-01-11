package com.docren.stockmarketapp.domain.repository

import com.docren.stockmarketapp.domain.model.CompanyListing
import com.docren.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

}