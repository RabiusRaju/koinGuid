package com.example.koinguid2.roomYT.di

import android.app.Application
import androidx.room.Room
import com.example.koinguid2.roomYT.UserDao
import com.example.koinguid2.roomYT.UserDatabase
import org.koin.dsl.module


fun providesDatabase(application: Application):UserDatabase =
    Room.databaseBuilder(application,UserDatabase::class.java,"userdatabase")
        .fallbackToDestructiveMigration()
        .build()

fun provideDao(db:UserDatabase):UserDao = db.getUserDao()

val userDatabaseModule = module {

    single { providesDatabase(get()) }
    single { provideDao(get()) }
}