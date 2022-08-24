package com.example.koinguid2.RetrofitTY

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.koinguid2.roomYT.User
import com.example.koinguid2.roomYT.UserDao
import kotlinx.coroutines.launch

class RetrofitViewModel constructor(private val apiService: ApiService, private val dao : UserDao) : ViewModel() {

    suspend fun getPost() = viewModelScope.launch {
        apiService.getPost()
    }

    fun insert(user:User) = viewModelScope.launch {
        dao.insert(user)
    }
}