package com.example.navegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val TvResult = findViewById<TextView>(R.id.TvResult)
    }
}