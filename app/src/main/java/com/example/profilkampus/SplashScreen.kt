package com.example.profilkampus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class SplashScreen : AppCompatActivity() {

    private lateinit var ivAnimSplash : ImageView

    private var X = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        if (savedInstanceState != null){
            X = savedInstanceState.getInt("splash")
        }

        ivAnimSplash = findViewById(R.id.ivAnimeSplash)

        X++

        Handler(Looper.getMainLooper()).postDelayed({
            if(X <= 1){
                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            }
            finish()
        }, 3000L)

        Glide.with(this@SplashScreen)
                .load(R.drawable.giphy2)
                .into(ivAnimSplash)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("splash", X)
    }
}