package com.example.myapplication5
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.*
import java.util.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cap = findViewById<TextView>(R.id.cap)
        val ent = findViewById<EditText>(R.id.ecap)
        val but = findViewById<Button>(R.id.button)
        val phone = findViewById<EditText>(R.id.mob)
        cap.text = randomString(4)
        ent.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {

                if(cap.text.toString().equals(p0.toString(),true))
                {
                    but.setOnClickListener {
                        val intent = Intent(this@MainActivity,MainActivity2::class.java)
                        intent.putExtra("phone",phone.text.toString())
                        Toast.makeText(applicationContext, "Successfully sent", Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                    }
                }
                else if(cap.text.toString() !== (p0.toString()))
                {
                    but.setOnClickListener {
                        val intent = Intent(this@MainActivity, MainActivity2::class.java)
                        Toast.makeText(applicationContext, "Captcha invalid!", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }

        })

    }
    fun randomString(stringLength: Int): String {
        val list = "0123456789".toCharArray()
        var randomS = ""
        for (i in 1..stringLength) {
            randomS += list[getRandomNumber(0, list.size - 1)]
        }
        return randomS
    }

    fun getRandomNumber(min: Int, max: Int): Int {
        return Random().nextInt((max - min) + 1) + min
    }
}
