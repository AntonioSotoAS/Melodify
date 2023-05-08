package com.antonio.melodify.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.antonio.melodify.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val intentLogin = Intent(this,LoginActivity::class.java)

        val txtIniciarSesion = findViewById<TextView>(R.id.txt_inciar_sesion)

        txtIniciarSesion.setOnClickListener {
            startActivity(intentLogin)
        }
    }
}