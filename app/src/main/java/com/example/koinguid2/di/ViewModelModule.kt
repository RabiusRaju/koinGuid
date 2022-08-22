package com.example.koinguid2.di

import com.example.koinguid2.demo.viewModel.MainViewModel
import com.example.koinguid2.demo.viewModel.Test
import com.example.koinguid2.demo.viewModel.TestImp
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModel = module  {
    factory { TestImp() } bind  Test::class
    viewModel { MainViewModel(get()) }
}