package com.example.koinguid2.RetrofitTY

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RetrofitViewModel constructor(private val apiService: ApiService) : ViewModel() {

    suspend fun getPost() = viewModelScope.launch {
        apiService.getPost()
    }
}