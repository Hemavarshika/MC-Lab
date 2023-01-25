package com.example.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fname =findViewById<EditText>(R.id.ans1)
        var sname =findViewById<EditText>(R.id.ans2)
        var rad1=findViewById<RadioButton>(R.id.r1)
        var rad2=findViewById<RadioButton>(R.id.r2)
        var spin = findViewById<Spinner>(R.id.spinner)
        var btn= findViewById<Button>(R.id.b1)
        ArrayAdapter.createFromResource(
            this, R.array.countries, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spin.adapter = adapter
        }

        btn.setOnClickListener() {
            val intent = Intent(this@MainActivity, NewActivity::class.java)

            val bundle = Bundle()
            bundle.putString("fn", fname.text.toString())
            bundle.putString("sn", sname.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }
}