package com.example.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.SimpsonCharacter

// Esta clase extiende de RecyclerView
class SimpsonCharacterAdapter(private val simpsonCharacterList: List<SimpsonCharacter>, private val onClickListener:(SimpsonCharacter) -> Unit): RecyclerView.Adapter<SimpsonCharacterViewHolder>() {

    // Devuelve al viewHolder los atributos que tiene pintar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpsonCharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SimpsonCharacterViewHolder(layoutInflater.inflate(R.layout.item_simpson_character, parent, false))
    }

    // Devuelve el tamaño de items que va a tener la lista
    override fun getItemCount(): Int = simpsonCharacterList.size

    // Metodo que va a pasar por cada uno de los items y va a llamar a la función render del SimpsonCharacterViewHolder
    override fun onBindViewHolder(holder: SimpsonCharacterViewHolder, position: Int) {
        val item = simpsonCharacterList[position]
        holder.render(item, onClickListener)
    }
}