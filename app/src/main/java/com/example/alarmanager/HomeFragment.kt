package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCrearAlarma = requireView().findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val btnCalendario = requireView().findViewById<Button>(R.id.btnCalendario)
        val btnAlarmas = requireView().findViewById<Button>(R.id.btnAlarmas)
        val tvAlarma1 = requireView().findViewById<TextView>(R.id.tvAlarma1)
        val btnAlarma1 = requireView().findViewById<Button>(R.id.btnArrow1)
        val tvAlarma2 = requireView().findViewById<TextView>(R.id.tvAlarma2)
        val btnAlarma2 = requireView().findViewById<Button>(R.id.btnArrow2)
        val tvAlarma3 = requireView().findViewById<TextView>(R.id.tvAlarma3)
        val btnAlarma3 = requireView().findViewById<Button>(R.id.btnArrow3)
        val tvAlarma4 = requireView().findViewById<TextView>(R.id.tvAlarma4)
        val btnAlarma4 = requireView().findViewById<Button>(R.id.btnArrow4)
        val tvAlarma5 = requireView().findViewById<TextView>(R.id.tvAlarma5)
        val btnAlarma5 = requireView().findViewById<Button>(R.id.btnArrow5)

        btnCrearAlarma.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_crearAlarmaFragment)
        }
        tvAlarma1.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        btnAlarma1.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        tvAlarma2.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        btnAlarma2.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        tvAlarma3.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        btnAlarma3.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        tvAlarma4.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        btnAlarma4.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        tvAlarma5.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }
        btnAlarma5.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_editarAlarmaFragment)
        }


    }

}