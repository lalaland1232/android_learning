package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*;
import android.content.*;

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btn1=findViewById<Button>(R.id.btn)
        btn1.setOnClickListener{
            intent= Intent(applicationContext , MainActivity::class.java)
            startActivity(intent)


        }
    }
}