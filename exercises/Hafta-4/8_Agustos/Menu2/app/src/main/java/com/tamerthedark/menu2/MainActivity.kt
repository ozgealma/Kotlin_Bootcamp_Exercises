package com.tamerthedark.menu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.tamerthedark.menu2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        handleClickes()


    }

    private fun handleClickes() {
        binding.textView1.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            intent.putExtra("name", "Nazlıcan")
            startActivity(intent)
        }

        binding.textView2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.textView3.setOnClickListener {
            Snackbar.make(binding.root, "Activity 3 YOK", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_activity1 -> {
                Snackbar.make(binding.root, "Activity 1", Snackbar.LENGTH_SHORT).show()
                val intent = Intent(this, FirstActivity::class.java)
                startActivity(intent)
            }

            R.id.action_activity2 -> {
                Snackbar.make(binding.root, "Activity 2", Snackbar.LENGTH_SHORT).show()
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}