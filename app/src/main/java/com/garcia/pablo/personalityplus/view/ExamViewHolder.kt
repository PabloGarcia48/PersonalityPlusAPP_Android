package com.garcia.pablo.personalityplus.view

import androidx.recyclerview.widget.RecyclerView
import com.garcia.pablo.personalityplus.databinding.ItemStepBinding
import com.garcia.pablo.personalityplus.model.entities.Option
import com.garcia.pablo.personalityplus.model.entities.Step

class ExamViewHolder(val binding: ItemStepBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Step) {
        binding.rbOption0.text = getOptionText(item.options[0])
        binding.rbOption1.text = getOptionText(item.options[1])
        binding.rbOption2.text = getOptionText(item.options[2])
        binding.rbOption3.text = getOptionText(item.options[3])
    }

    fun getOptionText(option: Option): String {
        return "${option.featureName}: ${option.description}"
    }
}