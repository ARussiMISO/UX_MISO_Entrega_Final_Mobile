package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class EditarAlarmaFragment : Fragment(R.layout.fragment_editar_alarma) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val btnBackHome = requireView().findViewById<Button>(R.id.btnBackEditar)
        val btnOk = requireView().findViewById<Button>(R.id.btnGuardarAlarma)

        btnBackHome.setOnClickListener {
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_homeFragment)
        }

        btnOk.setOnClickListener {
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_homeFragment)
        }
    }
}