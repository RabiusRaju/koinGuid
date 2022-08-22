package com.example.koinguid2.container

import com.example.koinguid2.demo.Car
import com.example.koinguid2.demo.Engine
import com.example.koinguid2.demo.Wheel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

class Component : KoinComponent {

    //lazily
    val car:Car by inject()


    //eagerly
    val car1:Car = get()
}