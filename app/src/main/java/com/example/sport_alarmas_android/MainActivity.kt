package com.example.sport_alarmas_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<ImageView>(R.id.edit_icon)
        buttonClick.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }

        val createAlarmIcon = findViewById<ImageView>(R.id.create_icon)
        createAlarmIcon.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }
    }
}