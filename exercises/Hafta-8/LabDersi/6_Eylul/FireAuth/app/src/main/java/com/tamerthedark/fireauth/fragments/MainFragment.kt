package com.tamerthedark.fireauth.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.tamerthedark.fireauth.R
import com.tamerthedark.fireauth.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var auth: FirebaseAuth
    private var mail: String? = null
    private var uid: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        auth = FirebaseAuth.getInstance()

        val mailLogin = arguments?.getString("emailLogin")
        val uidLogin = arguments?.getString("uidLogin")

        val mailRegister = arguments?.getString("emailRegister")
        val uidRegister = arguments?.getString("uidRegister")

        when {
            mailLogin != null && uidLogin != null -> {
                mail = mailLogin
                uid = uidLogin
            }

            mailRegister != null && uidRegister != null -> {
                mail = mailRegister
                uid = uidRegister
            }

            else -> {
                mail = ""
                uid = ""
            }
        }

        binding.uid.text = uid
        binding.mail.text = mail


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            auth.signOut()
            findNavController().navigate(R.id.action_mainFragment_to_loginFragment)
        }
    }
}