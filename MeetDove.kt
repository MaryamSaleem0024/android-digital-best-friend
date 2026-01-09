package com.example.digitalbestfriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MeetDove : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meet_dove)

        var moveButtontoUserCreateAccount = findViewById<Button>(R.id.button)

        moveButtontoUserCreateAccount.setOnClickListener {
            startActivity(Intent(this, MakeAccount::class.java))


        }
        var moveButtontoUserAccount = findViewById<Button>(R.id.button1)

        moveButtontoUserAccount.setOnClickListener {
            startActivity(Intent(this, AlreadyAccount::class.java))
        }
    }
}