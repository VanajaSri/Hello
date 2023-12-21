package com.example.btnaction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn =findViewById<Button>(R.id.button)
         btn.setOnClickListener(){
             val intent = Intent(this, SecondActivity::class.java)
             startActivity(intent)
             Toast.makeText(this,"Page",Toast.LENGTH_SHORT).show()
         }
    }
}