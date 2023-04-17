package com.example.fragmenttp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class PaymentFragment : Fragment() {

    private lateinit var adapter: paymentAdapter
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_payment, container, false)
        val recyclerView = view?.findViewById(R.id.recyclerView4) as RecyclerView
        val check=view?.findViewById(R.id.button3) as Button
        recyclerView.adapter = paymentAdapter(loadData())
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = paymentAdapter(loadData())
        recyclerView.adapter = adapter
check.setOnClickListener {

    check.findNavController().navigate(R.id.action_paymentFragment_to_loginFragment)
}
        return view
    }

    fun loadData():List<Payment> {
        val data = mutableListOf<Payment>()
        data.add(Payment("1200 DA"))


        return data
    }
}

