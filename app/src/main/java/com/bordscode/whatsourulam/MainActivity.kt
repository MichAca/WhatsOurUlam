package com.bordscode.whatsourulam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Adobo", "Sinigang", "Tinola", "Nilaga", "Siarsiado" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chooseFoodButton.setOnClickListener {

            var random = Random()
            var randomFood = random.nextInt(foodList.count())
            selectedFoodTextView.text = foodList[randomFood]

        }

        addFoodButton.setOnClickListener {

            val newFood = addFoodTextView.text.toString()
            foodList.add(newFood)
            addFoodTextView.text.clear()
            println(foodList)
        }
    }
}
