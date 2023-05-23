package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etbrand = findViewById<EditText>(R.id.etbrand)
        val etmodel = findViewById<EditText>(R.id.etmodel)
        val etbvariant = findViewById<EditText>(R.id.etvariant)
        val btnsubmit = findViewById<Button>(R.id.btnsubmit)

        btnsubmit.setOnClickListener {
            val brand = etbrand.text.toString()
            val model = etmodel.text.toString()
            val variant = etbvariant.text.toString()
            intent = Intent(applicationContext, MainActivity2::class.java).also{
                it.putExtra("EXTRA_BRAND", brand)
                it.putExtra("EXTRA_MODEL", model)
                it.putExtra("EXTRA_VARIANT", variant)
            }
            startActivity(intent)

        }
    }
}