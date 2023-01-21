package com.example.calculator

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayPop_up()
    }
    private fun displayPop_up(){
        var instructions_popup = Dialog(this)
        instructions_popup.setCancelable(false)

        instructions_popup.setContentView(R.layout.instructions_popup)
        instructions_popup.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        var txtAlert=instructions_popup.findViewById<TextView>(R.id.txtAlert)
        var Ok=instructions_popup.findViewById<TextView>(R.id.Ok)

        Ok.setOnClickListener{
            instructions_popup.dismiss()
        }
        instructions_popup.show()
    }

    fun savebutton(view: View){
        val rate=rate.text.toString().toFloat()

        val intent=Intent(this@MainActivity, page2::class.java)
        intent.putExtra("Rate",rate)
        startActivity(intent)
    }
}