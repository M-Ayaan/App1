package com.example.calculator

import android.content.Intent
import android.media.tv.TvContract.Channels.Logo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val topAnimation = AnimationUtils.loadAnimation(this, R.anim.spin_animation)
        val bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        val logo = findViewById<ImageView>(R.id.logo)
        val splashText = findViewById<TextView>(R.id.splashText)
        val desc = findViewById<TextView>(R.id.desc)

        logo.startAnimation(topAnimation)
        splashText.startAnimation(bottomAnimation)
        desc.startAnimation(bottomAnimation)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3500)
    }
}