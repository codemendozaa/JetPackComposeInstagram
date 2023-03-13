package com.example.jetpackcomposeinstagram.login.data.network

import com.example.jetpackcomposeinstagram.core.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun doLogin(user:String,password:String):Boolean{
     return   withContext(Dispatchers.IO){
          val response  =  retrofit.create(LoginClient::class.java).doLogin()
            response.body()?.success ?: false
        }
    }
}