package com.tamerthedark.recyclerview2

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.tamerthedark.recyclerview2.databinding.ItemRowBinding

class HobbyAdapter(private val hobbyList: ArrayList<Hobby>) : RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>() {

    inner class HobbyViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        return HobbyViewHolder(ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return hobbyList.size
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        holder.binding.tvHobby.text = hobbyList[position].hobbyName

        holder.itemView.setOnClickListener {
            val clickedItem = hobbyList[position].hobbyName
            val intent = Intent(holder.itemView.context, Name::class.java)
            intent.putExtra("hobby", clickedItem)
            holder.itemView.context.startActivity(intent)
        }
    }
}
