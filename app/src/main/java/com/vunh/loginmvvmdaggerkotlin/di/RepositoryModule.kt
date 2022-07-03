package com.vunh.loginmvvmdaggerkotlin.di

import com.vunh.loginmvvmdaggerkotlin.repository.login.LoginRepository
import com.vunh.loginmvvmdaggerkotlin.repository.login.LoginRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun provideLoginRepository(loginRepositoryImpl: LoginRepositoryImpl): LoginRepository
}