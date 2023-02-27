package com.example.staffsupportsystem

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        val iHome = Intent(this@splashscreen, MainActivity::class.java)
        Handler().postDelayed({
            startActivity(iHome)
            finish()
        }, 3000)
    }
}