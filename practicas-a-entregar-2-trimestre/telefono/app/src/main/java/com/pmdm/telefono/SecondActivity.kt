package com.pmdm.telefono

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val phone = intent.getStringExtra("phone")

        val textViewPhone = findViewById<TextView>(R.id.textViewPhone)

        val buttonBack = findViewById<Button>(R.id.buttonBack)

        textViewPhone.text = phone

        buttonBack.setOnClickListener {
            finish()
        }
    }
}
