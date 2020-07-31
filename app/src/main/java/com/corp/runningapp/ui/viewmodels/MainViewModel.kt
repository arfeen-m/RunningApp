package com.corp.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.corp.runningapp.repository.MainRepository
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}