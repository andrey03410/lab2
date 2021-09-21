package com.example.lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AboutActivity : AppCompatActivity() {
    private val tag = "about:andrey.gel"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }
    override fun onStart() {
        Log.d(tag, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(tag, "onRestart")
        super.onRestart()
    }
}