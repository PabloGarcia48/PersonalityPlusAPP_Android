package com.garcia.pablo.personalityplus.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.garcia.pablo.personalityplus.model.ExamService
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.model.utils.Event

@Suppress("RedundantIf")
class ExamViewModel : ViewModel() {
    private val examService: ExamService = ExamService()
    private val exam = examService.getExam()

    val showValidationError = MutableLiveData<Event<Int>>()
    val showValidationSuccess = MutableLiveData<Event<Exam>>()

    fun getExam(): Exam {
        return exam
    }

    fun onRadioButtonSelected(stepPosition: Int, radioButtonPosition: Int) {
        // TODO: Criar teste unitario
        for (optionPosition in 0..exam.steps[stepPosition].options.size) {
            /**
             * A gente quer percorrer todos os options olhando pro indice deles na lista
             * de forma a comparar esse indice com a posição do option selecionado(radioButtonPosition)
             * e atualizar o isChecked de todos os options com a seguinte regra:
             * Se o option em teste não é de mesmo indice que o option selecionado(radioButtonPosition)
             * passamos false para o isChecked, caso seja, passamos true
            */

            if (optionPosition == radioButtonPosition) {
                exam.steps[stepPosition].options[radioButtonPosition].isChecked = true
            } else {
                exam.steps[stepPosition].options[radioButtonPosition].isChecked = false
            }
        }
    }

    fun testFinished() {
        var countOptionsChecked = 0
        for (step in exam.steps) {
            for (option in step.options) {
                if (option.isChecked == true) {
                    countOptionsChecked += 1
                }
            }
        }
        if (countOptionsChecked == 40) {
            showValidationSuccess.value = Event(exam)
        } else {
            showValidationError.value = Event(countOptionsChecked)
        }
    }
}