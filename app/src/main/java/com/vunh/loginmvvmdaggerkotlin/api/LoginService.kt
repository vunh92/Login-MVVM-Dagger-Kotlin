package com.vunh.loginmvvmdaggerkotlin.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.vunh.loginmvvmdaggerkotlin.model.Account
import com.vunh.loginmvvmdaggerkotlin.utils.AppUtils
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginService {
    @FormUrlEncoded
    @POST("pda/account/login")
    fun callLoginAsync(
        @Field("username") username: String,
        @Field("password") password: String,
    ): Deferred<Account>
}