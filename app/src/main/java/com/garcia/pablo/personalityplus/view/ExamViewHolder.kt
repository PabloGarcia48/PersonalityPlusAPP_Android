package com.garcia.pablo.personalityplus.view

import android.widget.RadioButton
import androidx.recyclerview.widget.RecyclerView
import com.garcia.pablo.personalityplus.databinding.ItemStepBinding
import com.garcia.pablo.personalityplus.model.entities.Option
import com.garcia.pablo.personalityplus.model.entities.Step

class ExamViewHolder(
    val binding: ItemStepBinding,
    val listener: OnOptionChangedListener,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Step, pos: Int) {
        binding.tvTitle.text = "Step ${pos + 1}"
        binding.rbOption0.text = getOptionText(item.options[0])
        binding.rbOption1.text = getOptionText(item.options[1])
        binding.rbOption2.text = getOptionText(item.options[2])
        binding.rbOption3.text = getOptionText(item.options[3])

        binding.rgStep.setOnCheckedChangeListener { group, idRadioButton ->
            val radioButton: RadioButton? = group?.findViewById(idRadioButton)
            if (radioButton != null) {
                val index = group.indexOfChild(radioButton)
                listener.onChanged(pos, index)
            }
        }
    }

    fun getOptionText(option: Option): String {
        return "${option.featureName}: ${option.description}"
    }
}