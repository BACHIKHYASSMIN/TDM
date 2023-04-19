package com.example.fragmenttp
import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.fragmenttp.data.MenuModel
import com.example.fragmenttp.data.PaymentModel
import com.example.fragmenttp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    lateinit var myModel: PaymentModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var Value = findViewById(R.id.value) as TextView
        var Card = findViewById(R.id.button2) as Button
        var BtnAdd = findViewById(R.id.addd) as ImageButton
        var BtnDel = findViewById(R.id.del) as ImageButton
        var Prix = findViewById(R.id.prix) as TextView
        var Total = findViewById(R.id.tot) as TextView
        var valeur:Int=(Value.text).toString().toInt()
        myModel = PaymentModel()
        myModel.loadDate()
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
            val intent = Intent(this, PaymentActivity::class.java)
            intent.putExtra("PrixTotal", Total.text)
            startActivity(intent)
        }
    }
}
