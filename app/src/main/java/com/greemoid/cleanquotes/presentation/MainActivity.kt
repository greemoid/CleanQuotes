package com.greemoid.cleanquotes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greemoid.cleanquotes.QuoteApp
import com.greemoid.cleanquotes.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = (application as QuoteApp).viewModel
        val tvQuote = findViewById<CustomTextView>(R.id.tvQuote)
        val btnGetQuote = findViewById<CustomButton>(R.id.btnGetQuote)
        val progressBar = findViewById<CustomProgress>(R.id.progressBar)

        btnGetQuote.setOnClickListener {
            viewModel.getQuote()
        }

        viewModel.observe(this) { state ->
            state.show(progressBar, btnGetQuote, tvQuote)
        }
    }
}