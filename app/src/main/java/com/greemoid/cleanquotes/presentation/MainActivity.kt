package com.greemoid.cleanquotes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.greemoid.cleanquotes.QuoteApp
import com.greemoid.cleanquotes.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = (application as QuoteApp).viewModel
        val tvQuote = findViewById<TextView>(R.id.tvQuote)
        val btnGetQuote = findViewById<Button>(R.id.btnGetQuote)

        btnGetQuote.setOnClickListener {
            viewModel.getQuote()
        }

        viewModel.text.observe(this) {
            tvQuote.text = it
        }
    }
}