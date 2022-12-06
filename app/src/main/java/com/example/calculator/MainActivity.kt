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

        buttonn.setOnClickListener() {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
        }
        fun savebutton(view: View){
            val rate=rate.text.toString().toInt()

            val intent=Intent(this@MainActivity, page2::class.java)
            intent.putExtra("Rate",rate)
            startActivity(intent)
        }
    }
}