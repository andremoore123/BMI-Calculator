package com.andre.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HitungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        val button_hitung_ulang = findViewById<Button> (R.id.button_hitung_ulang)
        val bmi_text = findViewById<TextView>(R.id.skor_bmi)


        val bmi = intent.getDoubleExtra(EXTRA_MESSAGE, 0.0)
        val bmiScore = if(bmi == 0.0) "Inputan tidak valid" else bmi.toString()
        bmi_text.text = bmiScore
        button_hitung_ulang.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }


}