package com.tamerthedark.a6haftafragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tamerthedark.a6haftafragment.R
import com.tamerthedark.a6haftafragment.databinding.FragmentGirisBinding

class GirisFragment : Fragment() {

    private lateinit var binding: FragmentGirisBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentGirisBinding.inflate(inflater, container, false)

        binding.buttonEnter.setOnClickListener {
            findNavController().navigate(R.id.action_girisFragment_to_secondFragment, Bundle().apply {
                putString("name", binding.editTextPersonName.text.toString())
            })
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}