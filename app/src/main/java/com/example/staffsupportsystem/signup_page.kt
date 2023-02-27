package com.example.staffsupportsystem

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class signup_page : Activity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)
        val signup = findViewById<Button>(R.id.sign_up)
        signup.setOnClickListener {
            val Intent5= Intent(this,loginpage::class.java)
                    startActivity(Intent5)
                }


        }
    }
