package com.example.deviceroller

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.button)
//        rollbutton.text = "Lets Roll"
        rollbutton.setOnClickListener {
            Toast.makeText(this,"Button Clicked ",Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {


        val DrawableResource = when (Random.nextInt(6)+1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_5
        }
   val Diceimage : ImageView = findViewById(R.id.DiceImage)
        Diceimage.setImageResource(DrawableResource)
    }
}