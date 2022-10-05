package com.garcia.pablo.personalityplus.view

import androidx.recyclerview.widget.RecyclerView
import com.garcia.pablo.personalityplus.databinding.ItemStepBinding
import com.garcia.pablo.personalityplus.model.entities.Step

class ExamViewHolder(val binding: ItemStepBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Step) {
        binding.tvDescription.text = item.options[0].description
    }
}