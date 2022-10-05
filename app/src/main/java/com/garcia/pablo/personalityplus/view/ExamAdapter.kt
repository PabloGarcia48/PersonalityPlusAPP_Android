package com.garcia.pablo.personalityplus.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.garcia.pablo.personalityplus.databinding.ItemStepBinding
import com.garcia.pablo.personalityplus.model.entities.Exam

class ExamAdapter(val exam: Exam) : RecyclerView.Adapter<ExamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamViewHolder {
        val binding = ItemStepBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExamViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExamViewHolder, position: Int) {
        holder.bind(exam.steps[position])
    }

    override fun getItemCount(): Int {
        return exam.steps.size
    }
}