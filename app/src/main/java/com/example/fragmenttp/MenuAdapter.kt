package com.example.fragmenttp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(val data:List<Menu>) : RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuAdapter.MyViewHolder {
        return MenuAdapter.MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_layout, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: MenuAdapter.MyViewHolder, position: Int) {
        holder.apply {
            name.text = data[position].name
            unit.text= data[position].prix.toString()
            holder.image.setImageResource(data[position].image)

        }
        holder.itemView.setOnClickListener {
            // Handle item click here
            holder.itemView.findNavController()
                .navigate(R.id.action_anotherFragment_to_detailsActivity)

        }
    }
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById(R.id.foodName) as TextView
          val unit=view.findViewById(R.id.UnitPrice)as TextView
        val image=view.findViewById(R.id.imageView2)as ImageView
    }
}