package com.tamerthedark.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tamerthedark.recyclerview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var hobbyAdapter: HobbyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hobbyList = arrayListOf<Hobby>()
        hobbyList.add(Hobby("Swimming"))
        hobbyList.add(Hobby("Reading"))
        hobbyList.add(Hobby("Walking"))
        hobbyList.add(Hobby("Running"))
        hobbyList.add(Hobby("Cycling"))

        hobbyAdapter = HobbyAdapter(hobbyList)
        binding.recyclerView.adapter = hobbyAdapter
    }
}