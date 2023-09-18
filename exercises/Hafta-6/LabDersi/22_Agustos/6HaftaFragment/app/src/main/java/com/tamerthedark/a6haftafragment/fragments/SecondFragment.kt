package com.tamerthedark.a6haftafragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tamerthedark.a6haftafragment.R
import com.tamerthedark.a6haftafragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.textViewName.text = arguments?.getString("name")
        binding.textViewPassword.text = "Hoş Geldiniz"

        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_girisFragment)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}