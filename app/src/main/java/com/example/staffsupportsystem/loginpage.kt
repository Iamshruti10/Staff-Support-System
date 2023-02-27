package com.example.staffsupportsystem

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class loginpage : Activity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)


        val btn1 = findViewById<Button>(R.id.LOGIN)
        btn1.setOnClickListener {
            val Intent4 = Intent(this, home_page::class.java)
            startActivity(Intent4)

//
//            val btn = findViewById<Button>(R.id.gotosignup)
//            btn.setOnClickListener {
//                val Intent3 = Intent(this, signup_page::class.java)
//                startActivity(Intent3)
//            }
        }
    }}
