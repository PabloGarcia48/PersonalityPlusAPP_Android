package com.garcia.pablo.personalityplus.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.garcia.pablo.personalityplus.model.ExamService
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.model.entities.ExamResult

class ExamResultViewModel : ViewModel() {
    private val examService: ExamService = ExamService()

    val exam = MutableLiveData<ExamResult>()

    fun getExamResult(filledExam: Exam) {
        val examResult = examService.getExamResult(filledExam)
        exam.value = examResult
    }
}
