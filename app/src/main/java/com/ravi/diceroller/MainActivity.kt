package com.ravi.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
//import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button=findViewById(R.id.roll_button)
       // rollButton.text="let's Roll"
        rollButton.setOnClickListener {
           // Toast.makeText(this,"Button Click",Toast.LENGTH_SHORT).show()
           // Toast.setGravity(Gravity.TOP or Gravity.LEFT, 0, 0)
            rollDice()

        }
    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage: ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)



    }
}
