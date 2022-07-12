package com.vunh.loginmvvmdaggerkotlin.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vunh.loginmvvmdaggerkotlin.repository.login.LoginRepositoryImpl
import com.vunh.loginmvvmdaggerkotlin.users.UserManager
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(
    private val loginRepositoryImp: LoginRepositoryImpl,
    private val userManager: UserManager
): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            MainViewModel(loginRepositoryImp, userManager) as T
        }else {
            throw IllegalArgumentException("MainViewModel Not Found")
        }
    }
}