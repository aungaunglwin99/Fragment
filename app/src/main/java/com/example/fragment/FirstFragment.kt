package com.example.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(v: View, savedInstanceState: Bundle?) {
        super.onViewCreated(v, savedInstanceState)
        v.findViewById<Button>(R.id.btGoToSecond).setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(
                R.id.fcMain,
                SecondFragment()
            ).addToBackStack("").commit()
        }
    }
}
