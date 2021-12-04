package com.example.pratica4kotlin

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent
import android.widget.Button


class RegisterActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setTitle("Cadastro")

        val botao = findViewById<Button>(R.id.buttonregistrar)
        val botaovolt = findViewById<Button>(R.id.botaovoltar)

        botao.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
        botaovolt.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }


}