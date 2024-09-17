package com.example.roundsquare

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val squareTextView = findViewById<TextView>(R.id.textViewSquare)
        val radiusEditText = findViewById<TextView>(R.id.editRadiusNumber)
        val button = findViewById<Button>(R.id.buttonRunFunc)

        button.setOnClickListener(){
            try{
                squareTextView.text = "%.2f".format((radiusEditText.text.toString().toDouble()).pow(2) * 3.1415926535)
            }
            catch (e: Exception) {

                var toast = Toast.makeText(applicationContext, "Error: Радиус не может быть пустым!", Toast.LENGTH_SHORT)
                toast.show()

            }
        }
    }


}

