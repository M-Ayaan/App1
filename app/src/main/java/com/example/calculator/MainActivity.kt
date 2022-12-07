package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun savebutton(view: View){
        val rate=rate.text.toString().toFloat()

        val intent=Intent(this@MainActivity, page2::class.java)
        intent.putExtra("Rate",rate)
        startActivity(intent)
    }
}