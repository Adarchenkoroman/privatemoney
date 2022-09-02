package app.adachenko.privatemoney.data.repository

import app.adachenko.privatemoney.data.api.RetrofitInstance
import app.adachenko.privatemoney.model.beznal.BeznalItem
import app.adachenko.privatemoney.model.nalichka.NalichkaItem
import retrofit2.Response

class Repository {

    suspend fun getnal():Response<NalichkaItem>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal():Response<BeznalItem>{
        return RetrofitInstance.api.getBeznalMoneys()
    }
}