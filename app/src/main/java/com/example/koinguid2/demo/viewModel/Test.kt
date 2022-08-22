package com.example.koinguid2.demo.viewModel

import android.util.Log

interface Test{
    fun getTest()
}

class TestImp : Test{
    override fun getTest() {
        Log.d("main", "Hey View Model")
    }

}