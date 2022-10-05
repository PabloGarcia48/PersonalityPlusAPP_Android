package com.garcia.pablo.personalityplus.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.garcia.pablo.personalityplus.R
import com.garcia.pablo.personalityplus.databinding.ActivityExamBinding
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.viewmodel.ExamViewModel

class ExamActivity : AppCompatActivity() {
    private val examViewModel: ExamViewModel = ExamViewModel()
    private val exam = examViewModel.getExam()

    private var _binding: ActivityExamBinding? = null
    private val binding: ActivityExamBinding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityExamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
    }

    fun setUpRecyclerView() {
        binding.rvExamList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvExamList.adapter = ExamAdapter(exam)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
