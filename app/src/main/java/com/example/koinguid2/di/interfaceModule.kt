package com.example.koinguid2.di

import com.example.koinguid2.demo.interfaces.DemoImpl
import com.example.koinguid2.demo.interfaces.DemoOne
import com.example.koinguid2.demo.interfaces.DemoTwo
import com.example.koinguid2.demo.interfaces.Main
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val  interfaceModule = module {
    // there are 3 types declaration

    //factory { DemoImpl() as DemoOne }
    //factory<DemoOne> { DemoImpl()  }
    /*
    * Single Interface Class Bind
    * factory { DemoImpl()  } bind DemoOne::class
    * */


    /*
    * Multiple Interface Class Bind
    * */
    factory { DemoImpl() } binds arrayOf(DemoOne::class,DemoTwo::class)

    factory { Main(get(),get()) }
}