package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class TipoFragment : Fragment(R.layout.fragment_tipo) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnOk = requireView().findViewById<Button>(R.id.btnTipoOk)
        val btnBack = requireView().findViewById<Button>(R.id.btnTipoBack)

        btnOk.setOnClickListener {
            findNavController().navigate(R.id.action_tipoFragment_to_editarAlarmaFragment)
        }

        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_tipoFragment_to_editarAlarmaFragment)
        }

    }
}