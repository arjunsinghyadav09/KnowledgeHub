package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class TechnologiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technologies)

        val androidButton = findViewById<Button>(R.id.button1)
        val webButton = findViewById<Button>(R.id.button2)
        val iosButton = findViewById<Button>(R.id.button3)
        val mlButton = findViewById<Button>(R.id.button4)
        val blockButton = findViewById<Button>(R.id.button5)
        val cyberButton = findViewById<Button>(R.id.button6)
        val contactUsButton = findViewById<CardView>(R.id.contactUs)

        androidButton.setOnClickListener {
            intent = Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }

        webButton.setOnClickListener {
            intent = Intent(applicationContext, WebActivity::class.java)
            startActivity(intent)
        }

        iosButton.setOnClickListener {
            intent = Intent(applicationContext, iOS_Activity::class.java)
            startActivity(intent)
        }

        mlButton.setOnClickListener {
            intent = Intent(applicationContext,ML_Activity::class.java)
            startActivity(intent)
        }

        blockButton.setOnClickListener {
            intent = Intent(applicationContext, BlockChain_Activity::class.java)
            startActivity(intent)
        }

        cyberButton.setOnClickListener {
            intent = Intent(applicationContext, CyberSec_Activity::class.java)
            startActivity(intent)
        }

        contactUsButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+919876543210")
            startActivity(intent)
        }
    }
}