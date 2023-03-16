package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnIngreso: Button = view.findViewById(R.id.btnIngresar)

        btnIngreso.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }


        return view
    }

}