package com.example.passdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val brand = intent.getStringExtra("EXTRA_BRAND")
        val model = intent.getStringExtra("EXTRA_MODEL")
        val variant = intent.getStringExtra("EXTRA_VARIANT")

         val tvresult = findViewById<TextView>(R.id.tvresult)
        tvresult.text = "BRAND: "+ brand  + "  M0DEL: "+   model + "  VARIANT: "+ variant
    }
}