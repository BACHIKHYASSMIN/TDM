package com.example.fragmenttp.data
import androidx.lifecycle.ViewModel
import com.example.fragmenttp.R
import com.example.fragmenttp.Restaurant


class RestaurantModel  : ViewModel() {

    var list = mutableListOf<Restaurant>()

    fun loadData() {


        list.add(Restaurant("Mcdonalds",2000,R.drawable.restaurant))
        list.add(Restaurant("Burger King",2000,R.drawable.restaurant))
        list.add(Restaurant("Pizza hut",2000,R.drawable.restaurant))
        list.add(Restaurant("Mcdonalds",2000,R.drawable.restaurant))
        list.add(Restaurant("Burger King",2000,R.drawable.restaurant))
        list.add(Restaurant("Pizza hut",2000,R.drawable.restaurant))


    }
}

