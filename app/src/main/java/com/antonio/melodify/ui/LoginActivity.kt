package com.antonio.melodify.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.antonio.melodify.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val  intentRegister =  Intent(this,RegisterActivity::class.java)

        val registro = findViewById<TextView>(R.id.txt_registrate)

        registro.setOnClickListener {
            startActivity(intentRegister)
        }
    }
}