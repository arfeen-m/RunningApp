package com.corp.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.corp.runningapp.repository.MainRepository
import javax.inject.Inject

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {

    val totalTimeRun = mainRepository.getTotalTimeInMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalCaloriesBurned = mainRepository.getAllRunsSortedByCaloriesBurned()
    val totalAvgSpeed = mainRepository.getTotalAvgSpeed()

    val runSortedByDate = mainRepository.getAllRunsSortedByDate()
}