package com.tamerthedark.a17agustos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tamerthedark.a17agustos.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val book = intent.getStringExtra(Utils.book)
        val author = intent.getStringExtra(Utils.author)

        binding.tvBook.text = book
        binding.tvAuthor.text = author

    }
}