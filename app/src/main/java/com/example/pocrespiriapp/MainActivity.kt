package com.example.pocrespiriapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.AlgorithmLogic

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AlgorithmLogic().logic(this, "Test logic")

    }
}