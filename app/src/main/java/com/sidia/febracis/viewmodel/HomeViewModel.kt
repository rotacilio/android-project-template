package com.sidia.febracis.viewmodel

import androidx.lifecycle.ViewModel
import com.sidia.febracis.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
}