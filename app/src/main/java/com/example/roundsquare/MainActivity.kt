package com.example.roundsquare

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Deque




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
                                                                                                                                                                                                                        /*when (radiusEditText.text.toString().toDouble()){
                                                                                                                                                                                                                            in 0.0..1.0 -> squareTextView.text ="Число в прогрессии 1"
                                                                                                                                                                                                                            in 1.0..7.0 -> squareTextView.text = stringUpsideDown("туда сюда")
                                                                                                                                                                                                                            else -> squareTextView.text ="Значение не валидно"
                                                                                                                                                                                                                        }*/


                squareTextView.text = stringUpsideDown(radiusEditText.text.toString())
            }
            catch (e: Exception) {

                val toast = Toast.makeText(applicationContext, "Error!!!", Toast.LENGTH_SHORT)
                toast.show()

            }
        }
    }

                                                                                                                                                                                                                                                        /*fun whatFirstNumber (x: Double): String {

                                                                                                                                                                                                                                                            var i:Int = 1
                                                                                                                                                                                                                                                            var xx:Double= x;

                                                                                                                                                                                                                                                            while (i < 1000)
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                xx -= (1.00/i);
                                                                                                                                                                                                                                                                                                            //Log.d("Xis", "${xx} и ${i}")
                                                                                                                                                                                                                                                                if (xx < 0){break}
                                                                                                                                                                                                                                                                i++
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            return i.toString()
                                                                                                                                                                                                                                                        } */

    fun stringUpsideDown (stringInput: String): String{

        val stack = ArrayDeque<Char>()
        var stringOutput:String = ""
        var iter:Int = stringInput.length

        while (iter > 0){
            stack.addFirst(stringInput[stringInput.length-iter])
            iter--
        }
        while (stack.size > 0){
            stringOutput += stack.removeFirst()
        }
        return stringOutput
    }

}

