package com.example.gridtask

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.item_details.*

class FoodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_details)

        val bundle = intent.extras
        tvName.text = bundle?.getString("name")
        tvDetails.text = bundle?.getString("description")
        imgFoodDetails.setImageResource(bundle!!.getInt("image"))
            }
}
