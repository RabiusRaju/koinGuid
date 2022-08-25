package com.example.koinguid2.Qualifier

import android.util.Log
import org.koin.core.qualifier.named
import org.koin.dsl.module

class Users(val fName: String,val lName: String){

    fun getUser(){
        Log.d("main", "getUser: $fName $lName")
    }
}

private fun provideFName():String = "rabius sani"
fun provideLName():String = "raju"

val usersModule = module {

    factory(named("fName")){
        provideFName()
    }

    factory(named("lName")){
        provideLName()
    }

    factory { Users(get(named("fName")),get(named("lName"))) }

}