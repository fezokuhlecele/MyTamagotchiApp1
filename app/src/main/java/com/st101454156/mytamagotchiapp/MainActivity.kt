package com.st101454156.mytamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        textView = findViewById(R.id.textView2)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button4)

        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}