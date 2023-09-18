package com.tamerthedark.a17agustos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tamerthedark.a17agustos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
           if (binding.edBookName.text.isNullOrEmpty() || binding.edBookAuthor.text.isNullOrEmpty()){
               Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
           } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra(Utils.book, binding.edBookName.text.toString())
                intent.putExtra(Utils.author, binding.edBookAuthor.text.toString())
                startActivity(intent)
           }
        }
    }
}