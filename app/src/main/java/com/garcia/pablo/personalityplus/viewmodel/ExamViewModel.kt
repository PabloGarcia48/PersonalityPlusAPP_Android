package com.garcia.pablo.personalityplus.viewmodel

import androidx.lifecycle.ViewModel
import com.garcia.pablo.personalityplus.model.ExamService
import com.garcia.pablo.personalityplus.model.entities.Exam

class ExamViewModel : ViewModel() {
    private val examService: ExamService = ExamService()

    fun getExam(): Exam {

        return examService.getExam()
    }


}
