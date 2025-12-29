package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment


class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(v: View, savedInstanceState: Bundle?) {
        super.onViewCreated(v, savedInstanceState)
        val etName = v.findViewById<EditText>(R.id.etName)

        v.findViewById<Button>(R.id.btGoToThird).setOnClickListener {
            val thirdFragment = ThirdFragment()
            val bundle = Bundle()
            bundle.putString("userName", etName.text.toString())
            thirdFragment.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction().replace(
                R.id.fcMain,
                thirdFragment
            ).addToBackStack("").commit()
        }
    }
}
