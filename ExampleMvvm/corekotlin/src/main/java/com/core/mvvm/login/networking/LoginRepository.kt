package com.core.mvvm.login.networking


import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.core.mvvm.apiservice.ApiServiceLogin
import com.core.mvvm.login.model.ModelLoginRequest
import com.core.mvvm.login.model.ModelLoginResponse
import com.core.mvvm.utils.Utilerias
import com.google.gson.Gson
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginRepository() {

    var modelLoginResponse: ModelLoginResponse? = null
    var context: Context? = null
    var newsApi: ApiServiceLogin? = null

    companion object{

        var newsRepository: LoginRepository? = null

        fun getInstance(): LoginRepository? {
            if (newsRepository == null) {
                newsRepository = LoginRepository()
            }
            return newsRepository
        }

    }

     fun LoginRepository() {

    }


    fun serviceRequest(): MutableLiveData<ModelLoginResponse> {
        Log.e("EJECUTANDO", "EJECUTANDO SERVICIO REST")

        val mutableLiveData: MutableLiveData<ModelLoginResponse> = MutableLiveData<ModelLoginResponse>()
        val modelrequest: ModelLoginRequest = ModelLoginRequest()
        modelrequest.setIdentity_provider("cognito")
        modelrequest.setUsername("+525520868804")
        modelrequest.setPassword("MiPass1.0")
        newsApi  = RetrofitService.getInstanceLogin!!.create(ApiServiceLogin::class.java)
        val call = newsApi!!.getInstanceLogin(modelrequest)
        call!!.enqueue(object : Callback<JsonObject?> {
            override fun onResponse(call: Call<JsonObject?>, response: Response<JsonObject?>) {
                try {
                    val gson = Gson()
                    modelLoginResponse = gson.fromJson<ModelLoginResponse>(response.body(), ModelLoginResponse::class.java)
                    mutableLiveData.setValue(modelLoginResponse)
                } catch (e: Exception) {
                    Log.e("error", "error$e")
                }
            }

            override fun onFailure(call: Call<JsonObject?>, t: Throwable) {
                Log.e("error", "error$t")
            }
        })

        return mutableLiveData
    }


}