package com.example.koinguid2.demo

import android.util.Log

class Car constructor(private val engine: Engine, private val wheel: Wheel) {
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "getCar: car is running");
    }
}

class Engine {
    fun getEngine(){
        Log.d("main", "getEngine: Engine is running")
    }
}

class Wheel(){
    fun getWheel(){
        Log.d("main", "getWheel: Wheel is running")
    }
}