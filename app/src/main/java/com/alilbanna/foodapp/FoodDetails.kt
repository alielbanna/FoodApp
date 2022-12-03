package com.alilbanna.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val bundle = intent.extras
        val name = bundle!!.getString("name")
        val description = bundle.getString("description")
        val image = bundle.getInt("image")
        ivFoodImageDetails.setImageResource(image)
        tvNameDetails.text = name
        tvDescriptionDetails.text = description
    }
}