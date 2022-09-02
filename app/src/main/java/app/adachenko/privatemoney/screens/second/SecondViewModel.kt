package app.adachenko.privatemoney.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.adachenko.privatemoney.data.repository.Repository
import app.adachenko.privatemoney.model.beznal.Beznal
import app.adachenko.privatemoney.model.nalichka.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {

    var repo= Repository()
    val myMoneylist= MutableLiveData<Response<Beznal>>()


    fun getBeznalMoney(){
        viewModelScope.launch{
            myMoneylist.value=repo.getBeznal()
        }
    }
}