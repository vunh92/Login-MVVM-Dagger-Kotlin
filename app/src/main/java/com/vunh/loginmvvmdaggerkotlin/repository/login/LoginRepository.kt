package com.vunh.loginmvvmdaggerkotlin.repository.login

import com.vunh.loginmvvmdaggerkotlin.model.Account
import com.vunh.loginmvvmdaggerkotlin.usecase.UseCaseResult


interface LoginRepository {
    suspend fun getUser(username: String, password: String): UseCaseResult<Account>
}