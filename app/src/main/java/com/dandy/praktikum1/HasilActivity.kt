package com.dandy.praktikum1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val telp = intent.getStringExtra("telp")
        val tgl = intent.getStringExtra("tgl")
        val matkul = intent.getStringExtra("matkul")


        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val telpTextView = findViewById<TextView>(R.id.telpTextView)
        val tglTextView = findViewById<TextView>(R.id.tglTextView)
        val matkulTextView = findViewById<TextView>(R.id.matkulTextView)

        val buttonKembali = findViewById<Button>(R.id.buttonKembali)


        namaTextView.setText(nama)
        emailTextView.setText(email)
        telpTextView.setText(telp)
        tglTextView.setText(tgl)
        matkulTextView.setText(matkul)

        buttonKembali.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}