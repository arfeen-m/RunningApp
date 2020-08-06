package com.corp.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corp.runningapp.db.Run
import com.corp.runningapp.repository.MainRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}