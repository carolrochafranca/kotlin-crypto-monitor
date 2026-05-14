package com.github.carolrochafranca.kotlin_cryptor_monitor.service

import com.github.carolrochafranca.kotlin_cryptor_monitor.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}