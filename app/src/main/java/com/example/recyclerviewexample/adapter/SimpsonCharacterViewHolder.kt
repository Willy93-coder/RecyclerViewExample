package com.example.recyclerviewexample.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.SimpsonCharacter
import com.example.recyclerviewexample.databinding.ItemSimpsonCharacterBinding

class SimpsonCharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSimpsonCharacterBinding.bind(view)

    fun render(
        simpsonCharacterModel: SimpsonCharacter,
        onClickListener: (SimpsonCharacter) -> Unit
    ) {
        binding.tvSimpsonCharacterName.text = simpsonCharacterModel.name
        Glide.with(binding.ivSimpsonCharacter.context).load(simpsonCharacterModel.photo)
            .into(binding.ivSimpsonCharacter)

        // Para cuando pulsamos en toda la celda
        itemView.setOnClickListener { onClickListener(simpsonCharacterModel) }
    }
}