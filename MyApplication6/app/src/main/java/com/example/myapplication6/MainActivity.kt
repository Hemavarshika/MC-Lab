
package com.example.myapplication6

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bundle :Bundle ?=intent.extras
        var fnr = bundle?.get("fn").toString()
        var lnr = bundle?.get("ln").toString()
        var pnr = bundle?.get("pn").toString()
        var mailr = bundle?.get("mail").toString()
        var dater = bundle?.get("date").toString()
        var genderr = bundle?.get("gender").toString()
        var addressr = bundle?.get("address").toString()

        //if(fn.)

        val fn = findViewById<EditText>(R.id.editTextTextPersonName).text
        val ln = findViewById<EditText>(R.id.editTextTextPersonName2).text
        val pn = findViewById<EditText>(R.id.editTextPhone).text
        val mail = findViewById<EditText>(R.id.editTextTextEmailAddress).text
        val date = findViewById<EditText>(R.id.editTextDate).text
        val gender = findViewById<EditText>(R.id.editTextTextPersonName3).text
        val address = findViewById<EditText>(R.id.editTextTextPersonName4).text

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener()
        {
            intent = Intent(this@MainActivity, MainActivity2::class.java)
            //intent.putExtra("name","$fn $ln")
            intent.putExtra("fn","$fn")
            intent.putExtra("ln","$ln")
            intent.putExtra("pn","$pn")
            intent.putExtra("mail","$mail")
            intent.putExtra("date","$date")
            intent.putExtra("gender","$gender")
            intent.putExtra("address","$address")
            //intent.putExtra("details","First name : $fn\nLast name : $ln\nPhone number : $pn\nMail : $mail\nDate : $date\nGender : $gender\nAddress : $address\n")
            startActivity(intent)
        }
    }
}