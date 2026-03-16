package com.example.recetassaludablesapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recetassaludablesapp.com.example.recetassaludablesapp.DBHelper

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)
        val btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)

        val dbHelper = DBHelper(this) // <-- crear instancia de DBHelper

        btnCreateAccount.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()

            if (user.isNotEmpty() && pass.isNotEmpty()) {
                val success = dbHelper.addUser(user, pass)
                if (success) {
                    Toast.makeText(this, "Cuenta creada con éxito", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Error al crear cuenta", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Llena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}