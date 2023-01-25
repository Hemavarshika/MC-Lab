package com.example.myapplication6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.annotation.SuppressLint
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var bundle :Bundle ?=intent.extras
        val tv = findViewById<TextView>(R.id.textView)
        var name = bundle?.get("key").toString()
        tv.text = "Hi $name"
    }
}