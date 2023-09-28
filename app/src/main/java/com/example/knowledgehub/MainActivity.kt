package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val letsGoButton = findViewById<Button>(R.id.buttonGo)

        letsGoButton.setOnClickListener {
            intent = Intent(applicationContext, TechnologiesActivity::class.java)
            startActivity(intent)
        }
    }
}