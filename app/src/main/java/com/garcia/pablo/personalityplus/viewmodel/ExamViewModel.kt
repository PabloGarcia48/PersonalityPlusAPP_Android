package com.garcia.pablo.personalityplus.viewmodel

import androidx.lifecycle.ViewModel
import com.garcia.pablo.personalityplus.model.PersonalityPlusService
import com.garcia.pablo.personalityplus.model.entities.Exam

class ExamViewModel : ViewModel() {
    private val personalityPlusService: PersonalityPlusService = PersonalityPlusService()

    fun getExam(): Exam {
        return personalityPlusService.getExam()
    }


}
