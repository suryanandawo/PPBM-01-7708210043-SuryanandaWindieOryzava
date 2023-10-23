package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainmenu)

        val btnFoto = findViewById<CardView>(R.id.cardfoto)
        btnFoto.setOnClickListener {
            val intent = Intent(this, FotografiActivity::class.java)
            startActivity(intent)
        }
        val btnProfile = findViewById<ImageView>(R.id.profile)
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        val btnVideo = findViewById<CardView>(R.id.cardvideo)
        btnVideo.setOnClickListener {
            val intent = Intent(this, VideographyActivity::class.java)
            startActivity(intent)
        }
        val btnLogo = findViewById<CardView>(R.id.cardlogo)
        btnLogo.setOnClickListener {
            val intent = Intent(this, LogoActivity::class.java)
            startActivity(intent)
        }
        val btnBack = findViewById<TextView>(R.id.kembali)
        btnBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}