package com.dandy.praktikum1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)

        simpanButton.setOnClickListener{
            namaEditText.setText("")
            emailEditText.setText("")
            Toast.makeText(this, "Berhasil Simpan", Toast.LENGTH_LONG).show()
        }

        batalButton.setOnClickListener{
            finish()
        }

    }
}