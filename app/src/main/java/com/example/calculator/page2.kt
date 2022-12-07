package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_page2.*

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
val indTxt = findViewById<TextView>(R.id.textInd)
        val intent=getIntent()
        val rate=-intent.getFloatExtra("Rate",0.0f)
        var ans = rate * -21.1
        indTxt.text= ans.toString()

    }
}