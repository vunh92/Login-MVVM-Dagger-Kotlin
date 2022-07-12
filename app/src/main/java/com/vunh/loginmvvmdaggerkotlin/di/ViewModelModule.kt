package com.vunh.loginmvvmdaggerkotlin.di

import com.vunh.loginmvvmdaggerkotlin.repository.login.LoginRepositoryImpl
import com.vunh.loginmvvmdaggerkotlin.users.UserManager
import com.vunh.loginmvvmdaggerkotlin.viewModel.LoginViewModelFactory
import com.vunh.loginmvvmdaggerkotlin.viewModel.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {
    @Provides
    fun providesLoginViewModelFactory(
        loginRepositoryImp: LoginRepositoryImpl,
        userManager: UserManager,
    ) = LoginViewModelFactory(loginRepositoryImp, userManager)

    @Provides
    fun providesMainViewModelFactory(
        loginRepositoryImp: LoginRepositoryImpl,
        userManager: UserManager,
    ) = MainViewModelFactory(loginRepositoryImp, userManager)
}