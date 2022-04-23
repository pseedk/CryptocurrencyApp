package com.pseedk.cryptocurrencyapp.presentation.coin_list

import com.pseedk.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
