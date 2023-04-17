package com.example.fragmenttp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttp.databinding.FragmentMainBinding

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
        data.add(Restaurant("Restaurant 1",2001))
        data.add(Restaurant("Restaurant 2",2002))
        data.add(Restaurant("Restaurant 3",2003))
        data.add(Restaurant("Restaurant 4",2004))
        data.add(Restaurant("Restaurant 5",2005))
        data.add(Restaurant("Restaurant 6",2006))
        data.add(Restaurant("Restaurant 7",2007))
        data.add(Restaurant("Restaurant 8",2008))
        data.add(Restaurant("Restaurant 9",2009))
        data.add(Restaurant("Restaurant 10",2010))
        data.add(Restaurant("Restaurant 11",2011))
        data.add(Restaurant("Restaurant 12",2012))
        data.add(Restaurant("Restaurant 13",2013))
        data.add(Restaurant("Restaurant 14",2014))
        data.add(Restaurant("Restaurant 15",2015))
        data.add(Restaurant("Restaurant 16",2016))
        data.add(Restaurant("Restaurant 17",2017))
        data.add(Restaurant("Restaurant 18",2018))
        return data
    }
}