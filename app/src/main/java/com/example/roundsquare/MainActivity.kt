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
                //squareTextView.text = "%.2f".format((radiusEditText.text.toString().toDouble()).pow(2) * 3.1415926535)
                when (radiusEditText.text.toString().toDouble()){
                    in 0.0..1.0 -> squareTextView.text ="1"
                    in 1.0..7.0 -> squareTextView.text =whatFirstNumber(radiusEditText.text.toString().toDouble())
                    else -> squareTextView.text ="Значение не валидно"
                    //TODO: давай сделай 8 вариант второй лабы. там надо функцию поудмать и туда сюда сделать мб
                }
            }
            catch (e: Exception) {

                var toast = Toast.makeText(applicationContext, "Error!!!", Toast.LENGTH_SHORT)
                toast.show()

            }
        }
    }

    fun whatFirstNumber (x: Double): String {
        var i:Int = 1
        while (x > 0 || i < 5)
        {x - 1/i
        i++}
        return i.toString()
    }


}

