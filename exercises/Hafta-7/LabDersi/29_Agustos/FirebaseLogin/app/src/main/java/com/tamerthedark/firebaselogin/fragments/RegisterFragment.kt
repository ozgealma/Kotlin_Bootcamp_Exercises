package com.tamerthedark.firebaselogin.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.tamerthedark.firebaselogin.R
import com.tamerthedark.firebaselogin.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(inflater, container, false)

        firebaseAuth = FirebaseAuth.getInstance()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener {
            if (isTextFieldsEmpty()) {
                Toast.makeText(requireContext(), "At least one textfield is EMPTY", Toast.LENGTH_SHORT).show()
            } else {
                registerToFirebase()
            }
        }

    }

    private fun registerToFirebase() {

        try {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(requireActivity()) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(requireContext(), "Registration successful", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(requireContext(), "Registration failed", Toast.LENGTH_SHORT).show()
                    }
                }
                .addOnFailureListener { fail ->
                    Log.d("tamer", "registerToFirebase: ${fail.localizedMessage}")
                }
        } catch (e: Exception) {
            Toast.makeText(requireContext(), e.localizedMessage, Toast.LENGTH_SHORT).show()
        }
    }

    private fun isTextFieldsEmpty(): Boolean {
        return binding.etEmail.text.toString().isEmpty() || binding.etPassword.text.toString().isEmpty()
    }

}