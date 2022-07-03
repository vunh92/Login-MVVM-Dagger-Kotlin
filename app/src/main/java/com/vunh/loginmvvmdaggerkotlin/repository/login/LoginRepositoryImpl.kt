package com.vunh.loginmvvmdaggerkotlin.repository.login

import com.vunh.loginmvvmdaggerkotlin.api.LoginService
import com.vunh.loginmvvmdaggerkotlin.model.Account
import com.vunh.loginmvvmdaggerkotlin.usecase.UseCaseResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(private val loginService: LoginService) : LoginRepository {
    override suspend fun getUser(username: String, password: String): UseCaseResult<Account> {
        return try {
            val result =
                withContext(Dispatchers.IO) { loginService.callLoginAsync(username, password).await() }
            UseCaseResult.Success(result)
        } catch (ex: Throwable) {
            UseCaseResult.Error(ex.message ?: "")
        }
    }
}