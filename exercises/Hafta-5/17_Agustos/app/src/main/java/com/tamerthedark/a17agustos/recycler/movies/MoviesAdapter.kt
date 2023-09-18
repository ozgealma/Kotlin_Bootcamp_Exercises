package com.tamerthedark.a17agustos.recycler.movies

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.tamerthedark.a17agustos.databinding.MovieRowBinding

class MoviesAdapter(val movieList:ArrayList<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: MovieRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesAdapter.ViewHolder {
        val view = MovieRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MoviesAdapter.ViewHolder, position: Int) {
        holder.binding.movieImage.setImageResource(movieList[position].poster)
        holder.binding.movieName.text = movieList[position].title

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, movieList[position].title, Toast.LENGTH_SHORT).show()
        }
    }
}