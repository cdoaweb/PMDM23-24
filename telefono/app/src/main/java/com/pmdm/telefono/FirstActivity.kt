package com.pmdm.telefono

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fi
                rst)
        val name = intent.getStringExtra("name")

        textViewName.text = name

        buttonBack.setOnClickListener {
            finish()
        }
    }
}
