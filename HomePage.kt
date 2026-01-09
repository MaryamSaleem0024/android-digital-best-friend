package com.example.digitalbestfriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        var moveButtontochatI = findViewById<TextView>(R.id.textView10)

        moveButtontochatI.setOnClickListener {
            startActivity(Intent(this, ChatBot::class.java))
        }

        var moveButtontogrowthI = findViewById<TextView>(R.id.textView11)

        moveButtontogrowthI.setOnClickListener {
            startActivity(Intent(this, Growth::class.java))
        }
        var moveButtontoJournal = findViewById<TextView>(R.id.textView12)

        moveButtontoJournal.setOnClickListener {
            startActivity(Intent(this, Journal::class.java))
        }
    }
}