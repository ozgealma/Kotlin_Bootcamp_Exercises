package com.tamerthedark.menu2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tamerthedark.menu2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tc = intent.getStringExtra("tc")

        binding.textView2.text = tc.toString()

    }
}