package com.example.fragmenttp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttp.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        var Value = view?.findViewById(R.id.value) as TextView
        var Card = view?.findViewById(R.id.button2) as Button
        var BtnAdd = view?.findViewById(R.id.addd) as ImageButton
        var BtnDel = view?.findViewById(R.id.del) as ImageButton
        var Prix = view?.findViewById(R.id.prix) as TextView
        var Total = view?.findViewById(R.id.tot) as TextView
        var valeur:Int=(Value.text).toString().toInt()
        Total.text="Total est 0"
        BtnAdd.setOnClickListener {
            valeur++
            Value.text=valeur.toString()
            var somme:Int =valeur*Prix.text.toString().toInt()
            Total.text="Total est"+somme.toString()
        }
BtnDel.setOnClickListener {
    valeur--
    Value.text=valeur.toString()
    var somme:Int =valeur*Prix.text.toString().toInt()
    Total.text="Total est "+somme.toString()
}
Card.setOnClickListener {
    Card.findNavController().navigate(R.id.action_detailsFragment_to_paymentFragment)
}
        return view

    }


    }
