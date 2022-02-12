package com.andre.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myriads.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_hitung = findViewById<Button>(R.id.button_hitung)
        val tinggi = findViewById<EditText>(R.id.input_tinggi).text
        val berat = findViewById<EditText>(R.id.input_berat).text

        button_hitung.setOnClickListener {
            val beratDouble = if(berat.isNotEmpty()) berat.toString().toDouble() else 0.0
            val tinggiDouble = if(tinggi.isNotEmpty()) tinggi.toString().toDouble()/100 else 0.0
            val bmi = beratDouble / (tinggiDouble * tinggiDouble)
            val intent = Intent(this, HitungActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, bmi)
            }
            startActivity(intent)
            finish()
        }
    }
}