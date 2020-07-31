package com.corp.runningapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.corp.runningapp.R
import com.corp.runningapp.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDao: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}