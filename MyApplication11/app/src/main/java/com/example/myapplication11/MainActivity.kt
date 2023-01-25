package com.example.myapplication11


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c = findViewById<EditText>(R.id.cels)
        val f = findViewById<EditText>(R.id.fahr)
        val b = findViewById<Button>(R.id.button)
        b.setOnClickListener() {
            if (c.isFocused) {
                val x = c.text.toString().toDouble()
                f.setText((9.toDouble() / 5 * x + 32).toString())
            } else if (f.isFocused) {
                val x = f.text.toString().toDouble()
                c.setText(((x - 32) * 5.toDouble() / 9).toString())
            }
        }
    }

}