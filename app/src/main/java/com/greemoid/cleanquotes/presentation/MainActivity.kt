package com.greemoid.cleanquotes.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.greemoid.cleanquotes.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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