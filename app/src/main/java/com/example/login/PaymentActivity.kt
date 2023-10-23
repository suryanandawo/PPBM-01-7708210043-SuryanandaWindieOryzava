package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

        val btnKembali = findViewById<TextView>(R.id.kembalilah)
        btnKembali.setOnClickListener {
            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
        }
        val btnBayar = findViewById<TextView>(R.id.bayar)
        btnBayar.setOnClickListener {
            val intent = Intent(this, PINactivity::class.java)
            startActivity(intent)
        }
    }
}