package com.garcia.pablo.personalityplus.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.garcia.pablo.personalityplus.databinding.ItemStepBinding
import com.garcia.pablo.personalityplus.model.entities.Exam

class ExamAdapter(
    val exam: Exam,
    val listener: OnOptionChangedListener
) : RecyclerView.Adapter<ExamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamViewHolder {
        val binding = ItemStepBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExamViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: ExamViewHolder, position: Int) {
        val step = exam.steps[position]
        holder.bind(step, position)
    }

    override fun getItemCount(): Int {
        return exam.steps.size
    }
}