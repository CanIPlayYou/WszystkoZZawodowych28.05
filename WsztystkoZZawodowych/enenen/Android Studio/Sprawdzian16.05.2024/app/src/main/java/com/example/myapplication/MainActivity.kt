package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imieINazwiskoText:TextView = findViewById(R.id.imieINazwiskoText)
        val listView1:ListView = findViewById(R.id.listView)
        val seekBar1:SeekBar = findViewById(R.id.seekBar1)
        val celWizytyText:TextView = findViewById(R.id.celWizytyText)
        val godzinaText:TextView = findViewById(R.id.godzinaText)
        val okButton:Button = findViewById(R.id.okButton)
        val resultText:TextView = findViewById(R.id.resultText)

        okButton.setOnClickListener {
            resultText.text = ""+imieINazwiskoText.text+", "+"Tutaj gatunek"+", "+"tutaj lat"+", "+celWizytyText.text+", "+godzinaText.text
        }
    }
}
