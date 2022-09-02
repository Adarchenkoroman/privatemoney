package app.adachenko.privatemoney.data.api

import app.adachenko.privatemoney.model.beznal.Beznal
import app.adachenko.privatemoney.model.beznal.BeznalItem
import app.adachenko.privatemoney.model.nalichka.Nalichka
import app.adachenko.privatemoney.model.nalichka.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiServise {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys():Response<Nalichka>


    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneys():Response<Beznal>
}