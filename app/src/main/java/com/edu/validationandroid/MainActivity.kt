package com.edu.validationandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRegister = findViewById<Button>(R.id.btn_Register)
        var username = findViewById<EditText>(R.id.et_username)
        var password = findViewById<EditText>(R.id.et_password)

        val userNameRegex: Regex = "[A-Za-z]{4,20}".toRegex()
        val passwordRegex: Regex = "[0-9]{4}".toRegex()

        btnRegister.setOnClickListener {
            if(username.text.isEmpty() || password.text.isEmpty()){
//                Log.i("VIJ","Inside 1 if")
                Toast.makeText(this,"Username or password shouldn't be empty",Toast.LENGTH_SHORT).show()
            }
            else if(username.text.isNotEmpty() && password.text.isNotEmpty()){
//                Log.i("VIJ","Inside 2 if")
                if(!username.text.toString().matches(userNameRegex)){
//                    Log.i("VIJ","Inside 3 if")
                    Toast.makeText(this,"Username doesn't follow the pattern ${userNameRegex.toString()}",Toast.LENGTH_SHORT).show()
                }
                if(!password.text.toString().matches(passwordRegex)){
//                    Log.i("VIJ","Inside 4 if")
                    Toast.makeText(this,"Password doesn't follow the pattern ${passwordRegex.toString()}",Toast.LENGTH_SHORT).show()
                }
            }

        }

    }
}