package com.example.pratica4kotlin

import android.app.Activity;
import android.content.Intent
import android.os.Bundle;
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setTitle("Login")

        val texto = findViewById<TextView>(R.id.inemail)
        val botao = findViewById<Button>(R.id.button)

        botao.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }

}