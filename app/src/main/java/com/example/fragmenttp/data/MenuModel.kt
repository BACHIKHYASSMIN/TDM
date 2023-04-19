package com.example.fragmenttp.data
import androidx.lifecycle.ViewModel
import com.example.fragmenttp.Menu
import com.example.fragmenttp.R


class MenuModel  : ViewModel() {

    var list = mutableListOf<Menu>()

    fun loadData() {


        list.add(Menu("Couscous",1200,R.drawable.couscous))
        list.add(Menu("Crepe",1200,R.drawable.crepe))
        list.add(Menu("CHAKHCOUKHA",1200,R.drawable.chakhchoukha))
        list.add(Menu("Pudding",1200,R.drawable.dessert))
        list.add(Menu("Couscous",1200,R.drawable.couscous))
        list.add(Menu("Crepe",1200,R.drawable.crepe))
        list.add(Menu("CHAKHCOUKHA",1200,R.drawable.chakhchoukha))
        list.add(Menu("Pudding",1200,R.drawable.dessert))



    }
}

