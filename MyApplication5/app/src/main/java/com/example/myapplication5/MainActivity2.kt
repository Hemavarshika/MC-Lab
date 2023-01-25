package com.example.myapplication5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val txt = findViewById<TextView>(R.id.phone1)
        val ph = intent.getStringExtra("phone")
        txt.text=ph
    }
}
