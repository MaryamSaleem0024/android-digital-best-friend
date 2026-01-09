package com.example.digitalbestfriend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class AlreadyAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_already_account)
        var moveButtontoHomePageNickName = findViewById<Button>(R.id.button2)

        moveButtontoHomePageNickName.setOnClickListener {
            startActivity(Intent(this, NickName::class.java))
        }
      //  fun onclick(view: View) {
        //    login(
          //      findViewById<TextInputEditText>(R.id.edtUserName).text.toString(),
            //    findViewById<TextInputEditText>(R.id.edtPassword).text.toString()
            //)
        //}

        //fun login(userName: String, password: String) {
          //  if (userName == "name" && password == "1234") {
            //    startActivity(Intent(this, MainActivity::class.java))
              //  Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
            //} else {
              //  Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            //}
    //    }
    //}
    }
}