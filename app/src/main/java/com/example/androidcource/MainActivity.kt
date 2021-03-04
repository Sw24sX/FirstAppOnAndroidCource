package com.example.androidcource

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.mainTextView)
        text.text = number.toString()
        number++
    }

    companion object {
        var number: Int = 0
    }

    fun onClick(view: View) {
        val intent: Intent = Intent(this, SquareActivity::class.java)
        intent.putExtra("number", number)
        startActivity(intent)
    }
}