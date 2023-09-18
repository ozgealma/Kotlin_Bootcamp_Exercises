package com.tamerthedark.a17agustos.recycler.cities

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamerthedark.a17agustos.databinding.ItemRowBinding

class RecyclerAdapter(val cityList: ArrayList<Cities>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    inner class ViewHolder(val binding:ItemRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvCity.text = cityList[position].name
    }
}
