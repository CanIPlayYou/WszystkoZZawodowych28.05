package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner
import android.widget.SpinnerAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var dniTygodnia = arrayOf<String?>("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    var posilki = arrayOf<String?>("Śniadanie", "Drugie śniadanie", "Obiad", "Podwieczorek", "Kolacja")

    internal lateinit var daysSpinner: Spinner
    internal lateinit var mealsSpinner: Spinner

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
        ///

        daysSpinner = findViewById(R.id.daysSpinner)
        daysSpinner.onItemSelectedListener = this

        val ad = ArrayAdapter<Any?>(this, R.layout.spinner_item, dniTygodnia)

        ad.setDropDownViewResource(R.layout.spinner_dropdown)

        daysSpinner.adapter = ad

        ///

        mealsSpinner = findViewById(R.id.mealsSpinner)
        mealsSpinner.onItemSelectedListener = this

        val ad2 = ArrayAdapter<Any?>(this, R.layout.spinner_item, posilki)
        ad2.setDropDownViewResource(R.layout.spinner_dropdown)

        mealsSpinner.adapter = ad2

        ////

        val nameText:TextView = findViewById(R.id.nameText)
        val skladnikiText:TextView = findViewById(R.id.skladnikiText)
        val saveButton: Button = findViewById(R.id.saveButton)
        val listView:ListView = findViewById(R.id.list_item)

        adapter = ArrayAdapter(this, R.layout.activity_list_item, R.id.row, lista)
        listView.adapter = adapter


        saveButton.setOnClickListener {
            adapter.add(daysSpinner.selectedItem.toString() + " - "+ mealsSpinner.selectedItem.toString()+ ": "+ skladnikiText.text)
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        //Toast.makeText(applicationContext, daysSpinner.selectedItem.toString() + " "+ mealsSpinner.selectedItem.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}
