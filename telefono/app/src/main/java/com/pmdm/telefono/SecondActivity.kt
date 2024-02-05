package com.pmdm.telefono

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val phone = intent.getStringExtra("phone")
        textViewPhone.text = phone

        buttonBack.setOnClickListener {
            finish()
        }
    }
}