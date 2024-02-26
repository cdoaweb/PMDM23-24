package com.pmdm.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtName:TextView
    private lateinit var bntA:Button
    private lateinit var bntB:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initEvent()
    }

    private fun initEvent() {
        txtName=findViewById(R.id.txt_name)
        bntA=findViewById<Button>(R.id.btn_a)

        bntA.setOnClickListener{
           // txtName.text="Soy de nuevo Carlos"
           // Toast.makeText(this,"Soy Carlos",Toast.LENGTH_LONG).show()

           val intent : Intent = Intent(this, MainActivity2::class.java).apply {
               .putExtra("name","Carlos")
           }
            startActivity(intent)
        }

    }

    //los metodos del onclick en el xml, no son privados, són públicos.
    fun onCancelar(view: View) {

        txtName.text="He cancelado"
        //val a : Int = 5
        //println("El valor de a es ${txtName.text}")
        Toast.makeText(this,"${txtName.text}", Toast.LENGTH_LONG).show()

    }

}