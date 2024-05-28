package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val lista:MutableList<String> = mutableListOf()

    lateinit var adapter: ArrayAdapter<String>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imieNazwiskoText: TextView = findViewById(R.id.imieNazwiskoText)
        val ileLatText: TextView = findViewById(R.id.ileLatText)
        val seekBar1:SeekBar = findViewById(R.id.seekBar1)
        val celWizytyText: TextView = findViewById(R.id.celWizytyText)
        val godzinaText: TextView = findViewById(R.id.godzinaText)
        val okButton: Button = findViewById(R.id.okButton)
        val wynikText: TextView = findViewById(R.id.wynikText)
        val listView: ListView = findViewById(R.id.list_item)

        adapter = ArrayAdapter(this, R.layout.activity_list_item, R.id.row, lista)
        listView.adapter = adapter

        adapter.add("Pies")
        adapter.add("Kot")
        adapter.add("Świnka morska")

        var gatunek:String = ""

        listView.setOnItemClickListener { parent, view, position, id ->
            val element = adapter.getItem(position)
            if(element.toString() == "Pies"){
                seekBar1.max = 18
                gatunek = " Pies"
            }
            if(element.toString() == "Kot"){
                seekBar1.max = 20
                gatunek = " Kot"
            }
            if(element.toString() == "Świnka morska"){
                seekBar1.max = 9
                gatunek = " Świnka morska"
            }
        }

        var liczba:Int = 0

        seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                liczba = progress
                ileLatText.text = "Ile ma lat? "+ liczba.toString()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                ileLatText.text = "Ile ma lat? "+ liczba.toString()
            }
        })

        okButton.setOnClickListener {
            wynikText.text = ""+imieNazwiskoText.text +", "+gatunek+", "+ seekBar1.progress +", "+ celWizytyText.text+ ", "+ godzinaText.text
        }
    }
}