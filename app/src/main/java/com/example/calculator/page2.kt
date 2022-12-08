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
        val banTxt = findViewById<TextView>(R.id.textBan)
        val usTxt = findViewById<TextView>(R.id.textUs)
        val pakTxt = findViewById<TextView>(R.id.textPak)
        val omanTxt = findViewById<TextView>(R.id.textOman)
        val phiTxt = findViewById<TextView>(R.id.textPhi)
        val canTxt = findViewById<TextView>(R.id.textCan)

        val intent=getIntent()
        val rate=-intent.getFloatExtra("Rate",0.0f)
        var ansind = rate * -22.4
        var ansban = rate * -28.02
        var ansus = rate * -0.27
        var anspak = rate * -61.18
        var ansoman = rate * -0.10
        var ansphi = rate * -15.06
        var anscan = rate * -0.37

        indTxt.text= ansind.toString()
        banTxt.text= ansban.toString()
        usTxt.text= ansus.toString()
        pakTxt.text= anspak.toString()
        omanTxt.text= ansoman.toString()
        phiTxt.text= ansphi.toString()
        canTxt.text= anscan.toString()


    }
}