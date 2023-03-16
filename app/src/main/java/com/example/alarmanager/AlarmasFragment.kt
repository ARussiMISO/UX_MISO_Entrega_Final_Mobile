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

class AlarmasFragment : Fragment(R.layout.fragment_alarmas) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCrearAlarma = requireView().findViewById<FloatingActionButton>(R.id.floatingActionButtonAlarmas)
        val btnHome = requireView().findViewById<Button>(R.id.btnHomeConsulta)
        val tvAlarma1 = requireView().findViewById<TextView>(R.id.tvAlarmaConsulta1)
        val btnAlarma1 = requireView().findViewById<Button>(R.id.btnArrowConsulta1)
        val tvAlarma2 = requireView().findViewById<TextView>(R.id.tvAlarmaConsulta2)
        val btnAlarma2 = requireView().findViewById<Button>(R.id.btnArrowConsulta2)
        val tvAlarma3 = requireView().findViewById<TextView>(R.id.tvAlarmaConsulta3)
        val btnAlarma3 = requireView().findViewById<Button>(R.id.btnArrowConsulta3)
        val tvAlarma4 = requireView().findViewById<TextView>(R.id.tvAlarmaConsulta4)
        val btnAlarma4 = requireView().findViewById<Button>(R.id.btnArrowConsulta4)
        val tvAlarma5 = requireView().findViewById<TextView>(R.id.tvAlarmaConsulta5)
        val btnAlarma5 = requireView().findViewById<Button>(R.id.btnArrowConsulta5)


        btnCrearAlarma.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_crearAlarmaFragment)
        }
        btnHome.setOnClickListener {
            findNavController().navigate(R.id.action_alarmasFragment_to_homeFragment)
        }
        tvAlarma1.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        btnAlarma1.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        tvAlarma2.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        btnAlarma2.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        tvAlarma3.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        btnAlarma3.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        tvAlarma4.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        btnAlarma4.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        tvAlarma5.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }
        btnAlarma5.setOnClickListener{
            findNavController().navigate(R.id.action_alarmasFragment_to_editarAlarmaFragment)
        }

    }

}