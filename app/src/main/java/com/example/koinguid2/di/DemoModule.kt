package com.example.koinguid2.di

import com.example.koinguid2.demo.Car
import com.example.koinguid2.demo.Engine
import com.example.koinguid2.demo.Wheel
import org.koin.dsl.module

val demoModule = module {
    //factory { Car() }
    factory { Engine() }
    factory { Wheel() }
    factory { Car(get(),get()) }

}