package com.st101454156.mytamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity2 : AppCompatActivity() {
    //declare
    private lateinit var imageView: ImageView
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var Feedbar: ProgressBar
    private lateinit var Cleanbar: ProgressBar
    private lateinit var Playbar: ProgressBar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //intialise
        imageView =findViewById(R.id.imageView)
        button =findViewById(R.id.Feedbutton)
        button2 =findViewById(R.id.Cleanbutton)
        button3 =findViewById(R.id.Playbutton)
        Feedbar =findViewById(R.id.Feedbar)
        Cleanbar =findViewById(R.id.Cleanbar)
        Playbar =findViewById(R.id.Playbar)

        // increase the progressbar by 50

        button.setOnClickListener {
            imageView.setImageResource(R.drawable.img)
            Feedbar.incrementProgressBy(50)
        }

        button2.setOnClickListener {
            imageView.setImageResource(R.drawable.img_2)
            Cleanbar.incrementProgressBy(50)


        }

        button3.setOnClickListener {
            imageView.setImageResource(R.drawable.img_1)
            Playbar.incrementProgressBy(50)
        }
    }
}

