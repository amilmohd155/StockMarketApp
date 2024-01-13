package com.docren.stockmarketapp.presentation.company_info

import com.docren.stockmarketapp.domain.model.CompanyInfo
import com.docren.stockmarketapp.domain.model.IntraDayInfo

data class CompanyInfoState(
    val stockInfos: List<IntraDayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
