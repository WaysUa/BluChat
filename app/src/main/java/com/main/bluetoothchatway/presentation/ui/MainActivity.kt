package com.main.bluetoothchatway.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.main.bluetoothchatway.R
import com.main.bluetoothchatway.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}