package com.pmdm.telefono

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.telefono.ui.theme.TelefonoTheme
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonActivityOne = findViewById<Button>(R.id.buttonActivityOne)

        val buttonActivityTwo = findViewById<Button>(R.id.buttonActivityTwo)

        buttonActivityOne.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            intent.putExtra("name", "Carlos Daniel Apellidos")
            startActivity(intent)
        }

        buttonActivityTwo.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("phone", "953-222-222")
            startActivity(intent)
        }
    }
}
