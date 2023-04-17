package com.example.fragmenttp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class RestaurantAdapter(val data:List<Restaurant>): RecyclerView.Adapter<RestaurantAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.restaurant_layout, parent, false))

    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            name.text = data[position].name
            year.text = data[position].year.toString()
        }
        holder.itemView.setOnClickListener {
            // Handle item click here
            holder.itemView.findNavController().navigate(R.id.action_mainFragment_to_anotherFragment)
        }


    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById(R.id.textName) as TextView
        val year = view.findViewById(R.id.textYear) as TextView

    }
}