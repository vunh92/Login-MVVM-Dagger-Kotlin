package com.vunh.loginmvvmdaggerkotlin.di

import com.vunh.loginmvvmdaggerkotlin.repository.login.LoginRepositoryImpl
import com.vunh.loginmvvmdaggerkotlin.viewModel.LoginViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {
    @Provides
    fun providesMainViewModelFactory(loginRepositoryImp: LoginRepositoryImpl) : LoginViewModelFactory {
        return LoginViewModelFactory(loginRepositoryImp)
    }
}