package com.tamerthedark.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tamerthedark.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("title")
        val director = intent.getStringExtra("director")
        val point = intent.getStringExtra("point")

        val filmList = arrayListOf<Film>()
        filmList.add(Film(title, director, point?.toInt()))
        filmList.add(Film("The Shawshank Redemption", "Frank Darabont", 9))
        filmList.add(Film("The Godfather", "Francis Ford Coppola", 9))
        filmList.add(Film("The Dark Knight", "Christopher Nolan", 8))
        filmList.add(Film("The Godfather: Part II", "Francis Ford Coppola", 8))
        filmList.add(Film("The Lord of the Rings: The Return of the King", "Peter Jackson", 8))
        filmList.add(Film("Pulp Fiction", "Quentin Tarantino", 8))
        filmList.add(Film("Schindler's List", "Steven Spielberg", 8))

        filmAdapter = FilmAdapter(filmList)
        binding.recyclerView.adapter = filmAdapter
    }
}