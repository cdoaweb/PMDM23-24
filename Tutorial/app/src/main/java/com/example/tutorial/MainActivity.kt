package comW.example.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tutorial.R

class MainActivity : AppCompatActivity() {
    private lateinit var txtPrimero : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // txtPrimero.text = findViewById(R.id.tx_primero)
        //println(txtPrimero.text)
    }
}