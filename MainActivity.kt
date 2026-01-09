package com.example.digitalbestfriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var moveButtontoUserI = findViewById<Button>(R.id.button4)

        moveButtontoUserI.setOnClickListener {
            startActivity(Intent(this, MeetDove::class.java))
        }
    }
}