package com.example.myapplication4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        val bundle= intent.extras
        val fn = bundle?.get("fn").toString();
        val ln = bundle?.get("ln").toString();
        val country = bundle?.get("country").toString();

        val eT = findViewById<TextView>(R.id.text5);

        eT.text = "first name: \n" + fn+ "last name: \n" + ln + "country : \n" + country;

    }
}