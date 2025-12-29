package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment


class ThirdFragment : Fragment(R.layout.fragment_third) {

    override fun onViewCreated(v: View, savedInstanceState: Bundle?) {
        super.onViewCreated(v, savedInstanceState)
        val tvThird = v.findViewById<TextView>(R.id.tvThird)
        val userName = arguments?.getString("userName")
        tvThird.text = userName
    }
}
