package com.example.digitalbestfriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MakeAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_account)




        var moveButtontoHomePageNickName = findViewById<Button>(R.id.button2)

        moveButtontoHomePageNickName.setOnClickListener {
            startActivity(Intent(this, NickName::class.java))
        }
    }
}