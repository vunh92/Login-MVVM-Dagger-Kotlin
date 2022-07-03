package com.vunh.loginmvvmdaggerkotlin.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vunh.loginmvvmdaggerkotlin.repository.login.LoginRepositoryImpl
import javax.inject.Inject

class LoginViewModelFactory @Inject constructor(
    private val loginRepositoryImp: LoginRepositoryImpl
): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            LoginViewModel(loginRepositoryImp) as T
        }else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}