package com.tamerthedark.fireauth.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.tamerthedark.fireauth.R
import com.tamerthedark.fireauth.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        auth = FirebaseAuth.getInstance()

        if (auth.currentUser != null) {
            findNavController().navigate(R.id.action_loginFragment_to_mainFragment, Bundle().apply {
                putString("emailLogin", auth.currentUser?.email)
                putString("uidLogin", auth.currentUser?.uid)
            })
        } else {
            Toast.makeText(requireContext(), "Not logged in", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            logIn()
        }

        binding.tvToRegisterScreen.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

    }

    private fun logIn() {
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        try {
            auth.signInWithEmailAndPassword(email, password)
                .addOnSuccessListener {
                    Toast.makeText(requireContext(), "${auth.currentUser?.email}", Toast.LENGTH_LONG).show()
                    findNavController().navigate(R.id.action_loginFragment_to_mainFragment,bundleOf(
                        "emailLogin" to auth.currentUser?.email,
                        "uidLogin" to auth.currentUser?.uid
                    ))
                }
                .addOnFailureListener {
                    Toast.makeText(requireContext(), it.localizedMessage, Toast.LENGTH_LONG).show()
                }

            binding.etEmail.text.clear()
            binding.etPassword.text.clear()
            resetfocus()

        } catch (e: Exception) {
            Toast.makeText(requireContext(), e.localizedMessage, Toast.LENGTH_LONG).show()
        }
    }

    private fun resetfocus() {
        binding.etEmail.clearFocus()
        binding.etPassword.clearFocus()
    }
}