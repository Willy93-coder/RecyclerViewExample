package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.adapter.SimpsonCharacterAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Vinculamos la vista
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    // Función para iniciar el recyclerView
    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        binding.recyclerSimpsonCharacter.layoutManager = manager
        binding.recyclerSimpsonCharacter.adapter =
            SimpsonCharacterAdapter(
                SimpsonCharacterProvider.simpsonCharacterList
            ) { simpsonCharacter -> onItemSelected(simpsonCharacter) }
    }

    private fun onItemSelected(simpsonCharacter: SimpsonCharacter) {
        Toast.makeText(this, simpsonCharacter.name, Toast.LENGTH_SHORT).show()
    }
}