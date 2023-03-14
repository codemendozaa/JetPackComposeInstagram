package com.example.jetpackcomposeinstagram.login.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Inject

class LoginService @Inject constructor(private val loginClient: LoginClient){

    suspend fun doLogin():Boolean{
     return   withContext(Dispatchers.IO){
          val response  =  loginClient.doLogin()
            response.body()?.success ?: false
        }
    }
}