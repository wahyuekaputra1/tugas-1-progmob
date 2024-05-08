package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnintent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnintent = findViewById(R.id.btnPindah)

        btnintent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnPindah -> run {
                val intentBiasa = Intent(this@MainActivity, NewActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}