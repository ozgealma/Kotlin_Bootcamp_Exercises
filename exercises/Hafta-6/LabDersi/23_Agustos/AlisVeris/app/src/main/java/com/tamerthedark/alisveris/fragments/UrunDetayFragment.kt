package com.tamerthedark.alisveris.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tamerthedark.alisveris.R
import com.tamerthedark.alisveris.data.Product
import com.tamerthedark.alisveris.databinding.FragmentUrunDetayBinding

class UrunDetayFragment : Fragment() {

    private lateinit var binding: FragmentUrunDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentUrunDetayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAddProduct.setOnClickListener {
            findNavController().navigate(UrunDetayFragmentDirections.actionUrunDetayFragmentToBasketFragment(
                urunDesc = binding.etProductDescription.text.toString(),
                urunAdi = binding.etProductName.text.toString(),
                urunFiyati = binding.etProductPrice.text.toString(),
                Product = Product("Gözlük", "3500", "Güneş gözlüğü")
            ))
        }
    }

}