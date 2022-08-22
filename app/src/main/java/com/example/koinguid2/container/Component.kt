package com.example.koinguid2.container

import com.example.koinguid2.demo.Car
import com.example.koinguid2.demo.interfaces.Main
import com.example.koinguid2.demo.viewModel.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

class Component : KoinComponent {

    //lazily
    val car:Car by inject()


    //eagerly
    val car1:Car = get()

    val main : Main by inject()

    val mainViewModel : MainViewModel by inject()
}