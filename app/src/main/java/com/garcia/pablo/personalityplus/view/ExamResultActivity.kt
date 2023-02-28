package com.garcia.pablo.personalityplus.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.garcia.pablo.personalityplus.databinding.ActivityExamBinding
import com.garcia.pablo.personalityplus.databinding.ActivityExamResultBinding
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.viewmodel.ExamResultViewModel

class ExamResultActivity : AppCompatActivity() {

    private var _binding: ActivityExamResultBinding? = null
    private val binding: ActivityExamResultBinding get() = _binding!!

    private val examResultViewModel = ExamResultViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val exam: Exam = intent.extras?.get("MEU_EXAME") as Exam

        examResultViewModel.getExamResult(filledExam = exam)

        examResultViewModel.exam.observe(this) { examResult ->
            binding.tvProfileResult.text = examResult.behaviorProfile.name
            binding.tvResultForteColerico.text = examResult.forteColericoPercentage.toString()
            binding.tvResultPopularSanguineo.text = examResult.popularSanguineoPercentage.toString()
            binding.tvResultSerenoFleumatico.text = examResult.serenoFleumaticoPercentage.toString()
            binding.tvResultPerfeitoMelancolico.text = examResult.perfeitoMelancolicoPercentage.toString()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
