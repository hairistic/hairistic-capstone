package com.example.capstoneHairistic

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenProcessActivity : AppCompatActivity() {

    private val splashScreenDuration = 3000L // Durasi Splash Screen dalam milidetik (3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_process)

        // Handler untuk menunda perpindahan ke tampilan selanjutnya
        Handler().postDelayed({
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish() // Menutup Splash Screen agar tidak dapat kembali ke halaman ini
        }, splashScreenDuration)
    }
}


