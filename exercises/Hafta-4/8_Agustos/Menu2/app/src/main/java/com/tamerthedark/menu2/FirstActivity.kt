package com.tamerthedark.menu2

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.tamerthedark.menu2.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding
    private var isEmpty = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        //Snackbar.make(binding.root, name.toString(), Snackbar.LENGTH_INDEFINITE).show()

        handleClick()

    }

    private fun areasIsEmpty(): Boolean {
        isEmpty = binding.etTC.text.toString().isEmpty() || binding.etPassword.text.toString().isEmpty()
        return isEmpty
    }

    private fun handleClick() {
        binding.buttonLogin.setOnClickListener {
            if (areasIsEmpty()){
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Hata")
                builder.setMessage("Alanlar boş bırakılamaz!")
                builder.setPositiveButton("Tamam") { dialog, which ->
                    Toast.makeText(this, "Tamam", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                builder.setNegativeButton("İptal") { dialog, which ->
                    Toast.makeText(this, "İptal", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                builder.setCancelable(false)
                builder.show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("tc", binding.etTC.text.toString())
                startActivity(intent)
            }
        }
    }
}