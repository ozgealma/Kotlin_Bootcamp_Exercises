package com.tamerthedark.alisveris.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.tamerthedark.alisveris.R
import com.tamerthedark.alisveris.data.Product
import com.tamerthedark.alisveris.databinding.FragmentBasketBinding

class BasketFragment : Fragment() {

    private lateinit var binding: FragmentBasketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBasketBinding.inflate(inflater, container, false)

        // Get the arguments passed from the previous fragment
        val productName = BasketFragmentArgs.fromBundle(requireArguments()).urunAdi
        val productPrice = BasketFragmentArgs.fromBundle(requireArguments()).urunFiyati
        val productDescription = BasketFragmentArgs.fromBundle(requireArguments()).urunDesc
        val product = BasketFragmentArgs.fromBundle(requireArguments()).Product

        Toast.makeText(
            requireContext(),
            "$productName $productPrice $productDescription ${product!!.name} ${product.price} ${product.description}",
            Toast.LENGTH_LONG
        ).show()


        return binding.root
    }
}