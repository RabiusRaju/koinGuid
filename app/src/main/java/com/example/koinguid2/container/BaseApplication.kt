package com.example.koinguid2.container

import android.app.Application
import com.example.koinguid2.di.demoModule
import com.example.koinguid2.di.interfaceModule
import com.example.koinguid2.di.viewModelModel
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(demoModule, interfaceModule,viewModelModel)
        }
    }
}