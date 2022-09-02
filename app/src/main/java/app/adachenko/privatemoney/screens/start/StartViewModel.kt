package app.adachenko.privatemoney.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.adachenko.privatemoney.data.repository.Repository
import app.adachenko.privatemoney.model.nalichka.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {

    var repo=Repository()
    val myMoneylist=MutableLiveData<Response<Nalichka>>()


    fun getNalMoney(){
        viewModelScope.launch{
           myMoneylist.value=repo.getnal()
        }
    }
}




