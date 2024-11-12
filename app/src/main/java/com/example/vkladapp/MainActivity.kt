package com.example.vkladapp

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import javax.xml.transform.Result

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

        var resultMain = 0


        buttonRes.setOnClickListener(){
            var percent = when{
                radBut3mon.isChecked -> 3
                radBut6mon.isChecked -> 6
                radBut12mon.isChecked -> 9
                else -> 0
            }
            val inputValue = textValue.text.toString().toIntOrNull()
            if (percent != 0 && inputValue != null && inputValue > 0) {
                    val result = percent * inputValue
                    val intent = ResultActivity.newIntent(this, result)
                    startActivity(intent)
            } else {
                var toast = Toast.makeText(applicationContext,"Error: Заолните поля!",Toast.LENGTH_SHORT)
                toast.show()
            }
            }
    }
}