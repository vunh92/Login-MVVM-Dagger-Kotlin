package com.vunh.loginmvvmdaggerkotlin.di

import com.google.gson.Gson
import com.vunh.loginmvvmdaggerkotlin.api.LoginService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiModule {
    @Provides
    @Singleton
    fun provideLoginService( retrofit: Retrofit)
            : LoginService = retrofit.create(LoginService::class.java)
}