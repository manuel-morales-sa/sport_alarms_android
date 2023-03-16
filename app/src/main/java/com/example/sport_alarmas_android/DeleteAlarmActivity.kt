package com.example.sport_alarmas_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DeleteAlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_alarm)

        val acceptButtonDelete = findViewById<ImageView>(R.id.accept_icon)
        acceptButtonDelete.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val closeButtonDelete = findViewById<ImageView>(R.id.close_icon)
        closeButtonDelete.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }
    }
}