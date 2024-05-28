package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var zajeciaDoWyboru = arrayOf<String?>("Joga", "Aerobika", "Pilates")

    internal lateinit var zajeciaSpinner: Spinner

    val lista:MutableList<String> = mutableListOf()

    lateinit var adapter: ArrayAdapter<String>;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //
        zajeciaSpinner = findViewById(R.id.zajeciaSpinner)
        zajeciaSpinner.onItemSelectedListener = this


        val ad = ArrayAdapter<Any?>(this, R.layout.spinner_item, zajeciaDoWyboru)

        ad.setDropDownViewResource(R.layout.spinner_dropdown)

        zajeciaSpinner.adapter = ad
        //

        val imieNazwiskoText:TextView = findViewById(R.id.imieNazwiskoText)
        val seekBar1:SeekBar = findViewById(R.id.seekBar1)
        val timeText:TextView = findViewById(R.id.timeText)
        val okButton:Button = findViewById(R.id.okButton)
        val listView:ListView = findViewById(R.id.listView1)

        adapter = ArrayAdapter(this, R.layout.activity_list_item, R.id.row, lista)
        listView.adapter = adapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }
}