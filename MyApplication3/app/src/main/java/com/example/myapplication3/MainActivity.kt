package com.example.myapplication3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.floor

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fb= findViewById<EditText>(R.id.text4)
        val rat =findViewById<RatingBar>(R.id.ratingbar)
        val message =findViewById<TextView>(R.id.change)
        if (rat != null) {
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                val msg = rat.rating.toInt()
//                Toast.makeText(this@MainActivity,
//                    "Rating is: "+msg, Toast.LENGTH_SHORT).show()
                if (msg == 5)
                    message.setText("Awesome, I really loved it ! ")
                else if (msg == 4)
                    message.setText("Very tasty ! keep it up")
                else if (msg == 3)
                    message.setText("Not bad")
                else if (msg == 2)
                    message.setText("Need improvement")
                else
                    message.setText("Not as much as expected")


            }
        }

    }

}