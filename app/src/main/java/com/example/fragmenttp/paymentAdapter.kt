package com.example.fragmenttp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class paymentAdapter(val data:List<Payment>): RecyclerView.Adapter<paymentAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): paymentAdapter.MyViewHolder {
        return paymentAdapter.MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.paymentlist_layout, parent, false)
        )
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(holder: paymentAdapter.MyViewHolder, position: Int) {
        holder.apply {
      total.text=data[position].PrixTotal

        }



    }
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val total = view.findViewById(R.id.total) as TextView


    }
}