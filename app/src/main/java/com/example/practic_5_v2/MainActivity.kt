package com.example.practic_5_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun randomMe(view: View) {
            val randomIntent = Intent(this, MainActivity2::class.java)
            startActivity(randomIntent)
        }
    }
}
