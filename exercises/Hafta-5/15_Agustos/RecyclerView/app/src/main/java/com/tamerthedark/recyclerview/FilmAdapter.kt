package com.tamerthedark.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamerthedark.recyclerview.databinding.ItemFilmBinding

class FilmAdapter(private val filmList: List<Film>) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    inner class FilmViewHolder(val binding: ItemFilmBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.FilmViewHolder {
        return FilmViewHolder(ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: FilmAdapter.FilmViewHolder, position: Int) {
        holder.binding.tvTitle.text = filmList[position].title
        holder.binding.tvDirector.text = filmList[position].director
        holder.binding.tvPoint.text = filmList[position].point.toString()
    }

    override fun getItemCount(): Int {
        return filmList.size
    }
}