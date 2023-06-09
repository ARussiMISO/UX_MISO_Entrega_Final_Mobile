package com.example.alarmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController


class EditarAlarmaFragment : Fragment(R.layout.fragment_editar_alarma) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val btnBackHome = requireView().findViewById<Button>(R.id.btnBackEditar)
        val btnOk = requireView().findViewById<Button>(R.id.btnGuardarAlarma)
        val btnEliminar = requireView().findViewById<Button>(R.id.btnEliminarAlarma)
        val linearPosponer = requireView().findViewById<LinearLayout>(R.id.linearSubEditar6)
        val linearSonido = requireView().findViewById<LinearLayout>(R.id.linearSubEditar5)
        val linearRepetir = requireView().findViewById<LinearLayout>(R.id.linearSubEditar4)
        val linearTipo = requireView().findViewById<LinearLayout>(R.id.linearSubEditar1)

        btnBackHome.setOnClickListener {
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_homeFragment)
        }

        btnOk.setOnClickListener {
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_homeFragment)
        }

        btnEliminar.setOnClickListener {
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_eliminarAlarmaFragment)

        }

        linearPosponer.setOnClickListener{
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_posponerFragment)
        }
        linearSonido.setOnClickListener{
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_sonidoFragment)
        }
        linearTipo.setOnClickListener{
            findNavController().navigate(R.id.action_editarAlarmaFragment_to_tipoFragment)
        }
    }
}