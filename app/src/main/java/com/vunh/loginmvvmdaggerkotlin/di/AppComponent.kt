package com.vunh.loginmvvmdaggerkotlin.di

import android.content.Context
import com.vunh.loginmvvmdaggerkotlin.view.LoginActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, NetworkModule::class, ApiModule::class, ViewModelModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: LoginActivity)
}