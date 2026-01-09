package com.example.digitalbestfriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NickName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nick_name)
        var moveButtontoHomePage = findViewById<Button>(R.id.button3)

        moveButtontoHomePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))


        }
    }
}