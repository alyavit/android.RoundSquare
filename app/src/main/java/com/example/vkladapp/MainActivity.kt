package com.example.vkladapp

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private val vkladViewModel: VkladViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textValue = findViewById<TextView>(R.id.textView)
        val buttonRes = findViewById<Button>(R.id.button)
        val radBut3mon = findViewById<RadioButton>(R.id.radioButton3mon)
        val radBut6mon = findViewById<RadioButton>(R.id.radioButton6mon)
        val radBut12mon = findViewById<RadioButton>(R.id.radioButton12mon)
        //test9

        buttonRes.setOnClickListener(){
            var percent = when{
                radBut3mon.isChecked -> 3
                radBut6mon.isChecked -> 6
                radBut12mon.isChecked -> 9
                else -> 0
            }

            if (percent != 0 && (textValue.toString().toInt() > 0)) {
                //TODO: добавить запуск нового активити с выполнением подсчета по функции
            }

        }
    }
}