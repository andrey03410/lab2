package com.example.lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button



class MainActivity : AppCompatActivity() {
    private val tag = "main:andrey.gel"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val settingsButton = findViewById<Button>(R.id.settingsButton)
        val aboutButton = findViewById<Button>(R.id.aboutButton)
        settingsButton.setOnClickListener{
            startActivity(Intent(this, SettingsActivity::class.java))
        }
        aboutButton.setOnClickListener{
            startActivity(Intent(this, AboutActivity::class.java))
        }
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