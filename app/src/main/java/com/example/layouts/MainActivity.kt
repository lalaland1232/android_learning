package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*;
import android.content.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            intent=Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}