package com.tamerthedark.a17agustos.recycler.cities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tamerthedark.a17agustos.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cityList = arrayListOf<Cities>()
        cityList.add(Cities("İstanbul"))
        cityList.add(Cities("Ankara"))
        cityList.add(Cities("İzmir"))
        cityList.add(Cities("Bursa"))
        cityList.add(Cities("Adana"))
        cityList.add(Cities("Antalya"))
        cityList.add(Cities("Konya"))
        cityList.add(Cities("Gaziantep"))
        cityList.add(Cities("Şanlıurfa"))
        cityList.add(Cities("Kocaeli"))

        val adapter = RecyclerAdapter(cityList)
        binding.recyclerView.adapter = adapter

    }
}