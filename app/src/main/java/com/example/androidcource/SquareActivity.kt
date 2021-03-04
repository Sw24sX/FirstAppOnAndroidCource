package com.example.androidcource

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class SquareActivity : AppCompatActivity() {
    val TAG: String = "MyLogs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        Log.d(TAG, "On create (Square activity)")
        val number = intent.extras?.getInt("number")
        val text = findViewById<TextView>(R.id.squareResult)
        if (number != null) {
            text.text = (number * number).toString()
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "On pause (Square activity)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "On stop (Square activity)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "On restart (Square activity)")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "On resume (Square activity)")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "On destroy (Square activity)")
    }

    fun onClick(view: View) {
        Log.d(TAG, "Click button to main")
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}