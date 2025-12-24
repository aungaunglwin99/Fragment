package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_first, container, false)

         v.findViewById<Button>(R.id.btGoToSecond).setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().
            replace(
                R.id.fcMain,
                SecondFragment()
            )
                .addToBackStack("")
                .commit()
        }

        return v
    }
}
