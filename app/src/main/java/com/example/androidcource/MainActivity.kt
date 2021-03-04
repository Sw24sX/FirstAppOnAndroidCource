package com.example.androidcource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text_view)
        text.text = number.toString()
        number++
    }

    companion object {
        var number: Int = 0
    }

    fun onClick(view: View) {
        
    }
}