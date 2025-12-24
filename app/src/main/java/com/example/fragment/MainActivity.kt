package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    lateinit var fcMain : FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fcMain = findViewById(R.id.fcMain)


        supportFragmentManager.beginTransaction().
        replace(
            R.id.fcMain,
            FirstFragment()
        )
            .commit()
    }
}