package com.dandy.praktikum1

import android.content.Intent
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
        val telpEditText = findViewById<EditText>(R.id.telpEditText)
        val tglEditText = findViewById<EditText>(R.id.tglEditText)
        val matkulEditText = findViewById<EditText>(R.id.matkulEditText)

        simpanButton.setOnClickListener{
            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            val telp = telpEditText.text.toString()
            val tgl = tglEditText.text.toString()
            val jumlahMatkul = matkulEditText.text.toString()
            Toast.makeText(this, "Berhasil Simpan", Toast.LENGTH_LONG).show()

        val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("telp", telp)
            intent.putExtra("tgl", tgl)
            intent.putExtra("matkul", jumlahMatkul)

            startActivity(intent)

        }

        batalButton.setOnClickListener{
            finish()
        }

    }
}