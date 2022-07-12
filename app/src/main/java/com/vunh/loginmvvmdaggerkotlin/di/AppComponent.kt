package com.vunh.loginmvvmdaggerkotlin.di

import android.content.Context
import com.vunh.loginmvvmdaggerkotlin.users.UserManager
import com.vunh.loginmvvmdaggerkotlin.view.LoginActivity
import com.vunh.loginmvvmdaggerkotlin.view.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, NetworkModule::class, ApiModule::class, ViewModelModule::class, StorageModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: LoginActivity)
    fun inject(activity: MainActivity)
    fun userManager(): UserManager
}