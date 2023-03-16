package com.example.sport_alarmas_android

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val saveAlarm = findViewById<ImageView>(R.id.btnSave)
        saveAlarm.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }

        val cancelAlarm = findViewById<ImageView>(R.id.btnCancel)
        cancelAlarm.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}