package com.example.fragmenttp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // create an instance of your fragment
        val paymentFragment = PaymentFragment()

        // add the fragment to the container view
        fragmentTransaction.add(R.id.fragmentContainerView4, paymentFragment)

        // commit the transaction
        fragmentTransaction.commit()
    }
}