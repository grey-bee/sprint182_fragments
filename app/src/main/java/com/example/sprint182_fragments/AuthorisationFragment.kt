package com.example.sprint182_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sprint182_fragments.databinding.FragmentAuthorisationBinding

class AuthorisationFragment : Fragment() {

    private var _binding: FragmentAuthorisationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAuthorisationBinding.inflate(inflater, container, false)
        setupListeners()
        return binding.root
    }

    private fun setupListeners() {
        binding.registration.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container_view, RegistrationFragment())
                ?.addToBackStack("registration")?.commit()
        }
        binding.login.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container_view, MainScreenFragment())?.commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}