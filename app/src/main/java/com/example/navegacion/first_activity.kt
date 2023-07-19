package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class first_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val btnStrat = findViewById<AppCompatButton>(R.id.btnstart)
        val EtStart = findViewById<AppCompatEditText>(R.id.EtStart)

        btnStrat.setOnClickListener {
            val intent =Intent(this , resultActivity::class.java)
            startActivity(intent)
        }
    }
}