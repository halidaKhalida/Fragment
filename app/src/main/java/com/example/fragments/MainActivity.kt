package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val bfirstFragment=findViewById<Button>(R.id.b_firstFragment)
        val bsecondFragment=findViewById<Button>(R.id.b_secondFragment)

        bfirstFragment.setOnClickListener {
        val firstFragment=FirstFragment()
            setFragment(firstFragment)
        }
        bsecondFragment.setOnClickListener {
            val secondFragment=SecontFragment()
            setFragment(secondFragment)
        }
    }

    private fun setFragment(some:Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment,some).addToBackStack("bagStag").commit()
    }
}