package com.example.assignment2

import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Game : AppCompatActivity() {
    var image = findViewById<ImageView>(R.id.imageView2)

    val feed = findViewById<Button>(R.id.feebBtn)
    val clean = findViewById<Button>(R.id.cleanBtn)
    val play = findViewById<Button>(R.id.playBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)




        feed.setOnClickListener {
            image.setImageResource(R.drawable.feed)
        }





    }



}
