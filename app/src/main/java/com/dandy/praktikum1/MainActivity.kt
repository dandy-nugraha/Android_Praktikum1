package com.dandy.praktikum1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1  = findViewById<TextView>(R.id.Label1);

        textView1.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Hai.. Saya Dandy", Toast.LENGTH_SHORT).show()
        })

    }
}