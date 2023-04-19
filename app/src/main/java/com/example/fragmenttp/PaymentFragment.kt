package com.example.fragmenttp

import android.content.Intent
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

    val prix= requireActivity().intent.getIntExtra("PrixTotal",0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val prix= requireActivity().intent.getIntExtra("PrixTotal",0)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_payment, container, false)
        val recyclerView = view.findViewById(R.id.recyclerView4) as RecyclerView
        val check = view.findViewById(R.id.button3) as Button
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = paymentAdapter(loadData())
        recyclerView.adapter = adapter

        check.setOnClickListener {
            check.findNavController().navigate(R.id.action_paymentFragment_to_loginFragment)
        }
        return view
    }

    private fun loadData(): List<Payment> {
        val data = mutableListOf<Payment>()
        data.add(Payment(prix))
        return data
    }
}
