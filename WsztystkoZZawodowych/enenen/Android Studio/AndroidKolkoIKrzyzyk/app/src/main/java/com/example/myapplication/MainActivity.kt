package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)
        val btn4:Button = findViewById(R.id.btn4)
        val btn5:Button = findViewById(R.id.btn5)
        val btn6:Button = findViewById(R.id.btn6)
        val btn7:Button = findViewById(R.id.btn7)
        val btn8:Button = findViewById(R.id.btn8)
        val btn9:Button = findViewById(R.id.btn9)

        val currentPlayerTxt:TextView = findViewById(R.id.currentPlayerText)
        val winTxt:TextView = findViewById(R.id.winText)

        val restartButton:Button = findViewById(R.id.restartButton)

        var ktoTeraz:Int = 1  //1 - X,, 2 - Y

        btn1.setOnClickListener {
            if(ktoTeraz == 1){
                btn1.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn1.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn1.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn1.isClickable = false
            }

            if(btn1.text == "X" && btn2.text == "X" && btn3.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn2.text == "Y" && btn3.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn1.text == "X" && btn4.text == "X" && btn7.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn4.text == "Y" && btn7.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn1.text == "X" && btn5.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn5.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn2.setOnClickListener {
            if(ktoTeraz == 1){
                btn2.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn2.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn2.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn2.isClickable = false
            }

            if(btn1.text == "X" && btn2.text == "X" && btn3.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn2.text == "Y" && btn3.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn2.text == "X" && btn5.text == "X" && btn8.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn2.text == "Y" && btn5.text == "Y" && btn8.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn3.setOnClickListener {
            if(ktoTeraz == 1){
                btn3.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn3.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn3.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn3.isClickable = false
            }

            if(btn1.text == "X" && btn2.text == "X" && btn3.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn2.text == "Y" && btn3.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn3.text == "X" && btn5.text == "X" && btn7.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn3.text == "Y" && btn5.text == "Y" && btn7.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn3.text == "X" && btn6.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn3.text == "Y" && btn6.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn4.setOnClickListener {
            if(ktoTeraz == 1){
                btn4.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn4.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn4.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn4.isClickable = false
            }

            if(btn1.text == "X" && btn4.text == "X" && btn7.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn4.text == "Y" && btn7.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn4.text == "X" && btn5.text == "X" && btn6.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn4.text == "Y" && btn5.text == "Y" && btn6.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn5.setOnClickListener {
            if(ktoTeraz == 1){
                btn5.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn5.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn5.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn5.isClickable = false
            }

            if(btn1.text == "X" && btn5.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn5.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn2.text == "X" && btn5.text == "X" && btn8.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn2.text == "Y" && btn5.text == "Y" && btn8.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn3.text == "X" && btn5.text == "X" && btn7.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn3.text == "Y" && btn5.text == "Y" && btn7.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn4.text == "X" && btn5.text == "X" && btn6.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn4.text == "Y" && btn5.text == "Y" && btn6.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn6.setOnClickListener {
            if(ktoTeraz == 1){
                btn6.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn6.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn6.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn6.isClickable = false
            }

            if(btn3.text == "X" && btn6.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn3.text == "Y" && btn6.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn4.text == "X" && btn5.text == "X" && btn6.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn4.text == "Y" && btn5.text == "Y" && btn6.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn7.setOnClickListener {
            if(ktoTeraz == 1){
                btn7.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn7.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn7.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn7.isClickable = false
            }

            if(btn1.text == "X" && btn4.text == "X" && btn7.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn4.text == "Y" && btn7.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn3.text == "X" && btn5.text == "X" && btn7.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn3.text == "Y" && btn5.text == "Y" && btn7.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn7.text == "X" && btn8.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn7.text == "Y" && btn8.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn8.setOnClickListener {
            if(ktoTeraz == 1){
                btn8.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn8.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn8.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn8.isClickable = false
            }

            if(btn2.text == "X" && btn5.text == "X" && btn8.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn2.text == "Y" && btn5.text == "Y" && btn8.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn7.text == "X" && btn8.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn7.text == "Y" && btn8.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        btn9.setOnClickListener {
            if(ktoTeraz == 1){
                btn9.text = "X"
                currentPlayerTxt.text = "Teraz kolej Y"
                ktoTeraz++
                btn9.isClickable = false
            }
            else if(ktoTeraz == 2){
                btn9.text = "Y"
                currentPlayerTxt.text = "Teraz kolej X"
                ktoTeraz--
                btn9.isClickable = false
            }

            if(btn1.text == "X" && btn5.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn1.text == "Y" && btn5.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn3.text == "X" && btn6.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn3.text == "Y" && btn6.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }

            if(btn7.text == "X" && btn8.text == "X" && btn9.text == "X"){
                winTxt.text = "Wygrał X"
                restartButton.isVisible = true
            }

            if(btn7.text == "Y" && btn8.text == "Y" && btn9.text == "Y"){
                winTxt.text = "Wygrał Y"
                restartButton.isVisible = true
            }


            //
            if(winTxt.text == "Wygrał X" || winTxt.text == "Wygrał Y"){
                btn1.isClickable = false
                btn2.isClickable = false
                btn3.isClickable = false
                btn4.isClickable = false
                btn5.isClickable = false
                btn6.isClickable = false
                btn7.isClickable = false
                btn8.isClickable = false
                btn9.isClickable = false
            }
        }

        restartButton.setOnClickListener {
            ktoTeraz = 1
            currentPlayerTxt.text = "Teraz kolej X"
            winTxt.text = ""

            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""

            btn1.isClickable = true
            btn2.isClickable = true
            btn3.isClickable = true
            btn4.isClickable = true
            btn5.isClickable = true
            btn6.isClickable = true
            btn7.isClickable = true
            btn8.isClickable = true
            btn9.isClickable = true

            restartButton.isVisible = false
        }
    }
}