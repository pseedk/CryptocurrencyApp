package com.pseedk.cryptocurrencyapp.presentation.coin_detail

import com.pseedk.cryptocurrencyapp.domain.model.Coin
import com.pseedk.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
