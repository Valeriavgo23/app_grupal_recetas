package com.example.recetassaludablesapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Conecta con el XML del splash

        // Aquí se “mantiene” la pantalla mientras el ProgressBar gira
        Handler(Looper.getMainLooper()).postDelayed({
            // Abrir la pantalla principal después de 3 segundos
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cierra la SplashActivity
        }, 3000) // 3000 ms = 3 segundos
    }
}