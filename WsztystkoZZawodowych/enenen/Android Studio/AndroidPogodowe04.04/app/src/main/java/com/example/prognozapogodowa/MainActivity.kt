package com.example.prognozapogodowa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.ListView
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val lista:MutableList<String> = mutableListOf()

    lateinit var adapter: ArrayAdapter<String>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pogoda = arrayOf("", "", "", "", "", "", "")
        val temperatura = arrayOf(20, 17, 22, 24, 25, 27, 17)
        val prcntOpadow = arrayOf(0, 15, 2, 0, 0, 0, 24)

        pogoda[0] = "Poniedziałek - Słonecznie  -  "
        pogoda[1] = "Wtorek - Pochmurnie  -  "
        pogoda[2] = "Środa - Słonecznie  -  "
        pogoda[3] = "Czwartek - Słonecznie  -  "
        pogoda[4] = "Piątek - Słonecznie  -  "
        pogoda[5] = "Sobota - Słonecznie  -  "
        pogoda[6] = "Niedziela - Pochmurnie  -  "


        val cityName: TextView = findViewById(R.id.cityText)
        val sprButton: Button = findViewById(R.id.sprawdzPogodeBtn)
        val celsRadioBtn: RadioButton = findViewById(R.id.celsRadio)
        val farhRadioBtn: RadioButton = findViewById(R.id.fahreRadio)
        val pokOpadyCheckbox: CheckBox = findViewById(R.id.opadyCheckbox)
        val listView: ListView = findViewById(R.id.list_item)

        adapter = ArrayAdapter(this, R.layout.activity_list_item, R.id.row, lista)
        listView.adapter = adapter

        sprButton.setOnClickListener {
            if(cityName.text == "" || cityName.text == "" && !celsRadioBtn.isChecked || cityName.text == "" && !farhRadioBtn.isChecked || !celsRadioBtn.isChecked && !farhRadioBtn.isChecked){
                Toast.makeText(this,"Nie wprowadzono nazwy miejscowości lub nie wybrano jednostki temperatury", Toast.LENGTH_SHORT).show()
            }

            if(celsRadioBtn.isChecked && !pokOpadyCheckbox.isChecked){
                adapter.clear()
                for(i in pogoda.indices){
                    adapter.add(pogoda[i] + temperatura[i] + "°C")
                }
            }

            if(farhRadioBtn.isChecked && !pokOpadyCheckbox.isChecked){
                adapter.clear()
                for(i in pogoda.indices){
                    adapter.add(pogoda[i] + (temperatura[i]*1.8+32) + "°F")
                }
            }


            if(celsRadioBtn.isChecked && pokOpadyCheckbox.isChecked){
                adapter.clear()
                for(i in pogoda.indices){
                    adapter.add(pogoda[i] + temperatura[i] + "°C  -  opady: " + prcntOpadow[i]+"%")
                }
            }

            if(farhRadioBtn.isChecked && pokOpadyCheckbox.isChecked){
                adapter.clear()
                for(i in pogoda.indices){
                    adapter.add(pogoda[i] + (temperatura[i]*1.8+32) + "°F  -  opady: " + prcntOpadow[i]+"%")
                }
            }

        }
    }
}