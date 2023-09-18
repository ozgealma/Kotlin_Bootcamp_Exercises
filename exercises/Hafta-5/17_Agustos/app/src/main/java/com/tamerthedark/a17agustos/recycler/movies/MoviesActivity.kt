package com.tamerthedark.a17agustos.recycler.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.tamerthedark.a17agustos.R
import com.tamerthedark.a17agustos.databinding.ActivityMoviesBinding

class MoviesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoviesBinding
    private lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieList = arrayListOf<Movie>()
        movieList.add(Movie("Antman", R.drawable.antman))
        movieList.add(Movie("KaraBasan", R.drawable.karabasan))
        movieList.add(Movie("Maskeli Balo", R.drawable.maskelibalo))
        movieList.add(Movie("Mazerunner", R.drawable.mazerunner))
        movieList.add(Movie("Suicide Squad", R.drawable.suicidesquad))

        adapter = MoviesAdapter(movieList)
        binding.moviesRecyclerView.layoutManager = GridLayoutManager(this,3)
        binding.moviesRecyclerView.adapter = adapter


    }
}