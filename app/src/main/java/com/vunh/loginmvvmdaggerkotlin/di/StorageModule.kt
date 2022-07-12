package com.vunh.loginmvvmdaggerkotlin.di

import com.vunh.loginmvvmdaggerkotlin.storage.SharedPreferencesStorage
import com.vunh.loginmvvmdaggerkotlin.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}