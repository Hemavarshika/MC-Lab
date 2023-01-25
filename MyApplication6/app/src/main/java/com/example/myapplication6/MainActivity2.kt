package com.example.myapplication6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.annotation.SuppressLint
import android.content.Intent

import android.widget.Button
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var bundle :Bundle ?=intent.extras
        val tv = findViewById<TextView>(R.id.tv)
        //var message = bundle?.get("details").toString()
        var fn = bundle?.get("fn").toString()
        var ln = bundle?.get("ln").toString()
        var pn = bundle?.get("pn").toString()
        var mail = bundle?.get("mail").toString()
        var date = bundle?.get("date").toString()
        var gender = bundle?.get("gender").toString()
        var address = bundle?.get("address").toString()

        tv.text = "First name : $fn\nLast name : $ln\nPhone number : $pn\nMail : $mail\nDate : $date\nGender : $gender\nAddress : $address\n"

        val btn1 = findViewById<Button>(R.id.button2)
        val btn2 = findViewById<Button>(R.id.button3)

        btn1.setOnClickListener()
        {
            intent = Intent(this@MainActivity2, MainActivity::class.java)
            intent.putExtra("fn", fn)
            intent.putExtra("ln", ln)
            intent.putExtra("pn", pn)
            intent.putExtra("mail", mail)
            intent.putExtra("date", date)
            intent.putExtra("gender", gender)
            intent.putExtra("address", address)
            startActivity(intent)
        }

        btn2.setOnClickListener()
        {
            intent = Intent(this@MainActivity2, MainActivity3::class.java)
            intent.putExtra("key","$fn $ln")
            startActivity(intent)
        }
    }
}