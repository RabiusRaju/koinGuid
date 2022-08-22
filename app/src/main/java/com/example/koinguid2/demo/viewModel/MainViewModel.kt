package com.example.koinguid2.demo.viewModel

import androidx.lifecycle.ViewModel

class MainViewModel constructor(private val test: Test) : ViewModel() {
    fun getTest(){
        test.getTest()
    }
}