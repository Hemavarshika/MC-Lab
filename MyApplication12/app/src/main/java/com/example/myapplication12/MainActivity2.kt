package com.example.myapplication12


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener()
        {
            val i = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(i);
        }
    }
}