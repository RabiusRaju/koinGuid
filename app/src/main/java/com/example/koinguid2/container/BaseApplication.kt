package com.example.koinguid2.container

import android.app.Application
import com.example.koinguid2.di.demoModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(demoModule)
        }
    }
}