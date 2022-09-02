package app.adachenko.privatemoney.data.repository

import app.adachenko.privatemoney.data.api.RetrofitInstance
import app.adachenko.privatemoney.model.beznal.Beznal
import app.adachenko.privatemoney.model.nalichka.Nalichka
import retrofit2.Response

class Repository {

    suspend fun getnal():Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal():Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoneys()
    }
}