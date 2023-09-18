package com.tamerthedark.recyclerview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tamerthedark.recyclerview2.databinding.ActivityNameBinding

class Name : AppCompatActivity() {
    private lateinit var binding: ActivityNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hobby = intent.getStringExtra("hobby")
        binding.textView.text = hobby

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }
    }
}