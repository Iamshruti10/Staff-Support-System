package com.example.staffsupportsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hodlogin = findViewById<Button>(R.id.hodlogin)
        hodlogin.setOnClickListener {
            val Intent1 = Intent(this,loginpage::class.java)
            startActivity(Intent1)
        }

        val stafflogin = findViewById<Button>(R.id.staff_login)
        stafflogin.setOnClickListener {
            val Intent2 = Intent(this,loginpage::class.java)
            startActivity(Intent2)
        }

        }
    }
