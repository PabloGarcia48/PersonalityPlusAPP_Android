package com.garcia.pablo.personalityplus.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.viewmodel.ExamResultViewModel

class ExamResultActivity : AppCompatActivity() {

    private val examResultViewModel = ExamResultViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val exam: Exam = intent.extras?.get("MEU_EXAME") as Exam

        examResultViewModel.getExamResult(filledExam = exam)

        examResultViewModel.exam.observe(this) { examResult ->
            // TODO: renderizar uma tela de resultado para o usuário
        }
    }
}