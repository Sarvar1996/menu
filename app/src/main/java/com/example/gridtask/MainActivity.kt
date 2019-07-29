package com.example.gridtask


import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.foods.view.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var foodsList = ArrayList<Food>()
        var fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
        // load foods
        foodsList.add(Food("Coffee", R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Espersso", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("French Fires", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Honey",R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Strawberry", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Sugar cubes", R.drawable.car,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Coffee", R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Espersso", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("French Fires", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Honey",R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Strawberry", R.drawable.car,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Sugar cubes", R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Coffee", R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Espersso", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("French Fires", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Honey",R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Strawberry", R.drawable.download,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))
        foodsList.add(Food("Sugar cubes", R.drawable.fries,"Coffee preparation is the process of turning coffee beans into a beverage." +
                " While the particular steps vary with the type of coffee and with the raw materials, the process includes four basic steps; raw coffee " +
                "beans must be roasted, the roasted coffee beans must then be ground, the ground coffee must then be mixed with hot water for a certain " +
                "time (brewed), and finally the liquid coffee must be separated from the used grounds."))



    }

    class FoodAdapter : BaseAdapter {
        var foodsList = ArrayList<Food>()
        var context: Context? = null

        constructor(context: Context, foodsList: ArrayList<Food>) : super() {
            this.context = context
            this.foodsList = foodsList
        }

        override fun getCount(): Int {
            return foodsList.size
        }

        override fun getItem(position: Int): Any {
            return foodsList[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val food = this.foodsList[position]

            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodView = inflator.inflate(R.layout.foods, null)
            foodView.imgFood.setOnClickListener{
                val intent = Intent(context, FoodDetails::class.java)
                intent.putExtra("name", food.name!!)
                intent.putExtra("description", food.description!!)
                intent.putExtra("image", food.image!!)
                context!!.startActivity(intent)
            }

            foodView.imgFood.setImageResource(food.image!!)
            foodView.tvName.text = food.name!!

            return foodView
        }
    }
}