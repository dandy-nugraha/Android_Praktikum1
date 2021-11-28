package com.dandy.praktikum1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        getSupportActionBar()?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val sharedPreferences = this.getSharedPreferences("MY_SP", MODE_PRIVATE)
            val username = sharedPreferences.getString("username","")

            if(username == ""){
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, loadingActivity::class.java)
                startActivity(intent)
            }

        }, 2000)
    }
}