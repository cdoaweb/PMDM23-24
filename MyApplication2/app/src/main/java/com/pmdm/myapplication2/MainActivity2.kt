package com.pmdm.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var bntVolver:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onVolver (view: View) {
        val intentA = Intent(this, MainActivity::class.java)
        startActivity(intentA)
    }
}