package com.garcia.pablo.personalityplus.viewmodel

import androidx.lifecycle.ViewModel
import com.garcia.pablo.personalityplus.model.ExamService
import com.garcia.pablo.personalityplus.model.entities.Exam

class ExamViewModel : ViewModel() {
    private val examService: ExamService = ExamService()

    fun getExam(): Exam {

        return examService.getExam()
    }


    fun onRadioButtonSelected(stepPosition: Int, radioButtonPosition: Int) {
        // TODO: persistir exame e manipular o option
    }

}