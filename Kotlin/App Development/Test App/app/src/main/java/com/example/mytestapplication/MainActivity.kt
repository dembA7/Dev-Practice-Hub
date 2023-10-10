package com.example.mytestapplication

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mytestapplication.databinding.ActivityMainBinding

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}