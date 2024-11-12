package com.example.vkladapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    companion object {
        private const val EXTRA_RESULT = "EXTRA_RESULT"

        fun newIntent(context: Context, result: Int): Intent {
            return Intent(context, ResultActivity::class.java).apply {
                putExtra(EXTRA_RESULT, result)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val result = intent.getIntExtra(EXTRA_RESULT, 0)

        val textViewresult = findViewById<TextView>(R.id.textViewResult)

        textViewresult.setText(result.toString())
    }
}

