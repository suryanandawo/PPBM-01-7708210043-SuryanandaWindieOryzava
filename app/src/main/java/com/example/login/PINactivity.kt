package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PINactivity : AppCompatActivity() {

    private val CorrectPIN = "0821" // Gantilah dengan PIN yang benar

    private lateinit var pinEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pin)

        pinEditText = findViewById(R.id.pinEditText)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener(View.OnClickListener {
            val enteredPin = pinEditText.text.toString()
            if (enteredPin == CorrectPIN) {
                // PIN benar, aksi yang sesuai (misalnya, akses ke layar berikutnya)
                startActivity(Intent(this@PINactivity, SuccessActivity::class.java))
            } else {
                // PIN salah, berikan umpan balik kepada pengguna
                Toast.makeText(this@PINactivity, "PIN salah. Coba lagi.", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
