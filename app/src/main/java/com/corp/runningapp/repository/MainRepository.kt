package com.corp.runningapp.repository

import com.corp.runningapp.db.Run
import com.corp.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDao: RunDAO
){
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}