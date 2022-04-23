package com.pseedk.cryptocurrencyapp.domain.repository

import com.pseedk.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.pseedk.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}