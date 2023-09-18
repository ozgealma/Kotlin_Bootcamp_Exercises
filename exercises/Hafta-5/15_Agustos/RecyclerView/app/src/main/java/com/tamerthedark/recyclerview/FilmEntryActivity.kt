package com.tamerthedark.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tamerthedark.recyclerview.databinding.ActivityFilmEntryBinding

class FilmEntryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFilmEntryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmEntryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSend.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("title", binding.title.text.toString())
            intent.putExtra("director", binding.director.text.toString())
            intent.putExtra("point", binding.point.text.toString())
            startActivity(intent)
        }
    }
}