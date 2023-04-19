package com.example.fragmenttp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttp.data.MenuModel
import com.example.fragmenttp.databinding.FragmentAnotherBinding
import com.example.fragmenttp.databinding.FragmentMainBinding


class AnotherFragment : Fragment() {

    private lateinit var adapter: MenuAdapter
    lateinit var myModel: MenuModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_another, container, false)
        val recyclerView = view?.findViewById(R.id.recyclerView2) as RecyclerView
        val layoutManager = LinearLayoutManager(view.context)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val vm = ViewModelProvider (requireActivity()).get(MenuModel::class.java)
        vm.loadData()
        recyclerView.adapter = MenuAdapter(vm.list)


        return view
    }




}