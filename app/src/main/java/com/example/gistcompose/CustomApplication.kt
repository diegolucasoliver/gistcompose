package com.example.gistcompose

import android.app.Application
import com.example.gistcompose.domain.di.domainModule
import com.example.gistcompose.network.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CustomApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@CustomApplication)
            modules(
                networkModule,
                domainModule
            )
        }
    }
}