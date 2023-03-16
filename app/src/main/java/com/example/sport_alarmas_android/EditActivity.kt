package com.example.sport_alarmas_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val buttonClick = findViewById<ImageView>(R.id.edit_icon1)
        buttonClick.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }

        val buttonClick1 = findViewById<ImageView>(R.id.edit_icon2)
        buttonClick1.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }

        val buttonClick2 = findViewById<ImageView>(R.id.edit_icon3)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }

        val buttonClick3 = findViewById<ImageView>(R.id.edit_icon4)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }

        val buttonClick4 = findViewById<ImageView>(R.id.edit_icon5)
        buttonClick4.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }

        val buttonClick5 = findViewById<ImageView>(R.id.edit_icon6)
        buttonClick5.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }

        val deleteClick1 = findViewById<ImageView>(R.id.delete_icon1)
        deleteClick1.setOnClickListener {
            val intent = Intent(this, DeleteAlarmActivity::class.java)
            startActivity(intent)
        }

        val deleteClick2 = findViewById<ImageView>(R.id.delete_icon2)
        deleteClick2.setOnClickListener {
            val intent = Intent(this, DeleteAlarmActivity::class.java)
            startActivity(intent)
        }

        val deleteClick3 = findViewById<ImageView>(R.id.delete_icon3)
        deleteClick3.setOnClickListener {
            val intent = Intent(this, DeleteAlarmActivity::class.java)
            startActivity(intent)
        }

        val deleteClick4 = findViewById<ImageView>(R.id.delete_icon4)
        deleteClick4.setOnClickListener {
            val intent = Intent(this, DeleteAlarmActivity::class.java)
            startActivity(intent)
        }

        val deleteClick5 = findViewById<ImageView>(R.id.delete_icon5)
        deleteClick5.setOnClickListener {
            val intent = Intent(this, DeleteAlarmActivity::class.java)
            startActivity(intent)
        }

        val deleteClick6 = findViewById<ImageView>(R.id.delete_icon6)
        deleteClick6.setOnClickListener {
            val intent = Intent(this, DeleteAlarmActivity::class.java)
            startActivity(intent)
        }

        val createAlarmIcon = findViewById<ImageView>(R.id.create_icon)
        createAlarmIcon.setOnClickListener {
            val intent = Intent(this, EditActivityContent::class.java)
            startActivity(intent)
        }
    }
}