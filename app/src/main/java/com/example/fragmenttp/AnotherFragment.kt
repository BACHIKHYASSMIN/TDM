package com.example.fragmenttp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttp.databinding.FragmentAnotherBinding
import com.example.fragmenttp.databinding.FragmentMainBinding


class AnotherFragment : Fragment() {

    private lateinit var adapter: MenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_another, container, false)
        val recyclerView = view?.findViewById(R.id.recyclerView2) as RecyclerView
        recyclerView.adapter = MenuAdapter(loadData())
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = MenuAdapter(loadData())
        recyclerView.adapter = adapter

        return view
    }

    fun loadData():List<Menu> {
        val data = mutableListOf<Menu>()
        data.add(Menu("Plat 1","1200 DA"))
        data.add(Menu("Plat 2","2000 DA"))
        data.add(Menu("Plat 3","3000 DA"))

        return data
    }

}