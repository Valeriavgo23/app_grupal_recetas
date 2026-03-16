package com.example.recetassaludablesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.os.Looper
import android.content.Intent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Espera 3 segundos y abre la pantalla
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

}