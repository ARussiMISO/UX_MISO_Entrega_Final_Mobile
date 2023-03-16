package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class EliminarAlarmaFragment : Fragment(R.layout.fragment_eliminar_alarma) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val btnEliminarSi = requireView().findViewById<Button>(R.id.btnEliminarSi)
        val btnEliminarNo = requireView().findViewById<Button>(R.id.btnEliminarNo)

        btnEliminarSi.setOnClickListener {
            findNavController().navigate(R.id.action_eliminarAlarmaFragment_to_homeFragment)
        }

        btnEliminarNo.setOnClickListener {
            findNavController().navigate(R.id.action_eliminarAlarmaFragment_to_editarAlarmaFragment)
        }
    }
}