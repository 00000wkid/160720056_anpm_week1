package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var button=findViewById<Button>(R.id.button)
        button.setOnClickListener{
            Toast.makeText(this,"Login",Toast.LENGTH_LONG)
        }

    }
}