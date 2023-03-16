package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class PosponerFragment : Fragment(R.layout.fragment_posponer) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnOk = requireView().findViewById<Button>(R.id.btnPosponerOk)
        val btnBack = requireView().findViewById<Button>(R.id.btnPosponerBack)

        btnOk.setOnClickListener {
            findNavController().navigate(R.id.action_posponerFragment_to_editarAlarmaFragment2)
        }

        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_posponerFragment_to_editarAlarmaFragment2)
        }

    }
}