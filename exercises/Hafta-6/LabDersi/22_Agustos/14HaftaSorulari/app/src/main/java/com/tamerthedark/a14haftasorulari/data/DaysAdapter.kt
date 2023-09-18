package com.tamerthedark.a14haftasorulari.data

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.tamerthedark.a14haftasorulari.R
import com.tamerthedark.a14haftasorulari.databinding.RowLayoutBinding

import androidx.navigation.NavController

class DaysAdapter(private val list: List<Days>, private val navController: NavController) :
    RecyclerView.Adapter<DaysAdapter.DaysViewHolder>() {

    inner class DaysViewHolder(val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaysAdapter.DaysViewHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DaysViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DaysAdapter.DaysViewHolder, position: Int) {
        holder.binding.textView.text = list[position].day


        holder.itemView.setOnClickListener {
            when (position) {
                0 -> {
                    navController.navigate(R.id.action_mainFragment_to_firstFragment, Bundle().apply {
                        putSerializable("day", list[0])
                    })
                }

                1 -> {
                    navController.navigate(R.id.action_mainFragment_to_secondFragment)
                }

                2 -> {
                    Toast.makeText(holder.itemView.context, list[2].dayId.toString(), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}