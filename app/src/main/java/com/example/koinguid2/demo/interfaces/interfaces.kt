package com.example.koinguid2.demo.interfaces

import android.util.Log

interface DemoOne{
    fun getDemoOne()
}

interface DemoTwo{
    fun getDemoTwo()
}

class DemoImpl : DemoOne,DemoTwo{
    override fun getDemoOne() {
        Log.d("main", "This is demo one")
    }

    override fun getDemoTwo() {
        Log.d("main", "This is demo Two")
    }
}

class Main(private val demoOne: DemoOne, private val demoTwo: DemoTwo){
    fun getDemo(){
        demoOne.getDemoOne()
        demoTwo.getDemoTwo()
    }
}