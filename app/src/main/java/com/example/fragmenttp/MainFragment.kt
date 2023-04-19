package com.example.fragmenttp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {
    private lateinit var adapter: RestaurantAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val recyclerView = view?.findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.adapter = RestaurantAdapter(loadData())
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = RestaurantAdapter(loadData())
        recyclerView.adapter = adapter

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




    }
    fun loadData():List<Restaurant> {
        val data = mutableListOf<Restaurant>()
        data.add(Restaurant("Restaurant 1",2001,R.drawable.download))
        data.add(Restaurant("Restaurant 1",2001,R.drawable.download))

        data.add(Restaurant("Restaurant 3",2003,R.drawable.download))
        data.add(Restaurant("Restaurant 1",2001,R.drawable.download))

        data.add(Restaurant("Restaurant 3",2003,R.drawable.download))
        data.add(Restaurant("Restaurant 1",2001,R.drawable.download))

        data.add(Restaurant("Restaurant 3",2003,R.drawable.download))
        data.add(Restaurant("Restaurant 1",2001,R.drawable.download))

        data.add(Restaurant("Restaurant 3",2003,R.drawable.download))
        data.add(Restaurant("Restaurant 3",2003,R.drawable.download))

        return data
    }
}