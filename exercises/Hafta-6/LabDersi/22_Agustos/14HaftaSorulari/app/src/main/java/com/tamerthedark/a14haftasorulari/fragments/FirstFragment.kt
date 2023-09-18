package com.tamerthedark.a14haftasorulari.fragments

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.tamerthedark.a14haftasorulari.R
import com.tamerthedark.a14haftasorulari.data.Days
import com.tamerthedark.a14haftasorulari.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        val day = arguments?.getSerializable("day") as Days

        Toast.makeText(requireContext(), "${day.day} + ${day.dayId} ", Toast.LENGTH_SHORT).show()


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLogin.setOnClickListener {
            //check if the user tc is valid
            if (checkUser()) {
                //navigate to the second fragment
                findNavController().navigate(R.id.action_firstFragment_to_secondFragment)

            } else {
                //show popup

            }
        }
    }

    //check if the user tc and password is valid and not null
    private fun checkUser(): Boolean {
        return if (binding.editTextTc.text.toString().isNotEmpty() && binding.editTextPassword.text.toString()
                .isNotEmpty()
        ) {
            true
        } else {
            showPopUp()
            false
        }
    }

    private fun showPopUp() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Hata")
        builder.setMessage("Lütfen TC ve Şifre alanlarını doldurunuz")
        builder.setPositiveButton("Tamam") { dialog, _ ->
            dialog.dismiss()
        }
        builder.setNegativeButton("İptal") { dialog, _ ->
            dialog.dismiss()
        }
        builder.setCancelable(false)
        builder.show()
    }
}