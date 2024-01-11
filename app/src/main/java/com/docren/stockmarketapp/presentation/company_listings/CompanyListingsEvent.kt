package com.docren.stockmarketapp.presentation.company_listings

sealed class CompanyListingsEvent {
    data object Refresh: CompanyListingsEvent()
    data class onSearchQueryChange(val query:String): CompanyListingsEvent()
}