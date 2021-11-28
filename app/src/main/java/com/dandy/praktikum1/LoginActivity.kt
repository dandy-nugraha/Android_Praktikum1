package com.dandy.praktikum1

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.system.exitProcess

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val keluarLogin = findViewById<Button>(R.id.buttonKeluar)

        val usernametxt = findViewById<EditText>(R.id.usernameEdit)
        val passwordtxt = findViewById<EditText>(R.id.PasswordEdit)


        buttonLogin.setOnClickListener {
            val username = "dandy"

            val password = "12345"
            val email = "dandy@gmail.com"

            val usernameInput = usernametxt.text. toString()
            val passwordInput = passwordtxt.text. toString()

            if(usernameInput == username || usernameInput == email && passwordInput == password){
                val sharedPreferences = this.getSharedPreferences("MY_SP", MODE_PRIVATE)
                with(sharedPreferences.edit()) {
                    putString("username", usernameInput)
                    putString("password", passwordInput)
                    apply()
                }

                val intent = Intent(this,loadingActivity::class.java)
                startActivity(intent)


            }else{

                Toast.makeText(this, "Username / Password Salah", Toast.LENGTH_SHORT).show()
            }
        }
        keluarLogin.setOnClickListener{
            finish()
        }
    }
}