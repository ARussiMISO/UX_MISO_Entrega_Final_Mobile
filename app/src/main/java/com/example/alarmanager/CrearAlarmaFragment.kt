package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class CrearAlarmaFragment : Fragment(R.layout.fragment_crear_alarma) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val btnBackHome = requireView().findViewById<Button>(R.id.btnBackCrear)
        val btnOk = requireView().findViewById<Button>(R.id.btnCrearAlarmaNueva)

        btnBackHome.setOnClickListener {
            findNavController().navigate(R.id.action_crearAlarmaFragment_to_homeFragment)
        }

        btnOk.setOnClickListener {
            findNavController().navigate(R.id.action_crearAlarmaFragment_to_homeFragment)
        }
    }
}