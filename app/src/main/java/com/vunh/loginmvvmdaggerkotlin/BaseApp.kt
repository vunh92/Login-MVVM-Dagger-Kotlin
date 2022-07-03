package com.vunh.loginmvvmdaggerkotlin

import android.app.Application
import com.vunh.loginmvvmdaggerkotlin.api.LoginService
import com.vunh.loginmvvmdaggerkotlin.di.AppComponent
import com.vunh.loginmvvmdaggerkotlin.di.DaggerAppComponent
import com.vunh.loginmvvmdaggerkotlin.repository.login.LoginRepositoryImpl

class BaseApp : Application() {
//    companion object {
//        var baseApp: BaseApp? = null
//    }
//
//    lateinit var loginService: LoginService
////    lateinit var movieDatabase: MovieDatabase
//    lateinit var loginRepositoryImpl: LoginRepositoryImpl

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

//    override fun onCreate() {
//        super.onCreate()
//        baseApp = this
////        loginService = LoginService.getInstance()
////        movieDatabase = MovieDatabase.getInstance(this)
//        loginRepositoryImpl = LoginRepositoryImpl(
//            loginService,
////            movieDatabase
//        )
//    }
}