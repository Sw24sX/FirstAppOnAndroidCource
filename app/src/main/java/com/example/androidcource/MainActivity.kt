package com.example.androidcource

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG: String = "MyLogs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "On create (Main activity)")
        val text = findViewById<TextView>(R.id.mainTextView)
        number++
        text.text = number.toString()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "On pause (Main activity)")
    }



    override fun onStop() {
        super.onStop()
        Log.d(TAG, "On stop (Main activity)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "On restart (Main activity)")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "On resume (Main activity)")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "On destroy (Main activity)")
    }

    companion object {
        private var number: Int = 0
    }

    fun onClick(view: View) {
        Log.d(TAG, "Click button to square")
        val intent: Intent = Intent(this, SquareActivity::class.java)
        intent.putExtra("number", number)
        startActivity(intent)
    }
}