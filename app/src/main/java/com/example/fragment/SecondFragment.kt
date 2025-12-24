package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_second ,container, false)

        val etName = v.findViewById<EditText>(R.id.etName)

        v.findViewById<Button>(R.id.btGoToThird).setOnClickListener {
            val thirdFragment = ThirdFragment()
            val bundle = Bundle()
            bundle.putString("userName",etName.text.toString())
            thirdFragment.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction().
            replace(
                R.id.fcMain,
                thirdFragment
            )
                .addToBackStack("")
                .commit()
        }

        return v
    }
}
