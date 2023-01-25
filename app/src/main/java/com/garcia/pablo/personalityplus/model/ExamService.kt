package com.garcia.pablo.personalityplus.model

import com.garcia.pablo.personalityplus.model.entities.BehaviorProfile
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.model.entities.ExamResult
import com.garcia.pablo.personalityplus.model.utils.examMock
import java.lang.Exception

class ExamService {
    fun getExam(): Exam { // simulando uma request vinda do backend
        return examMock
    }

    fun getExamResult(filledExam: Exam): ExamResult {

        var popularSanguineoCount = 0
        var forteColericoCount = 0
        var perfeitoMelancolicoCount = 0
        var serenoFleumaticoCount = 0

        for (step in filledExam.steps) {
            for (option in step.options) {
                if (option.isChecked) {
                    when (option.behaviorProfile) {
                        BehaviorProfile.FORTE_COLERICO -> forteColericoCount++
                        BehaviorProfile.POPULAR_SANGUINEO -> popularSanguineoCount++
                        BehaviorProfile.PERFEITO_MELANCOLICO -> perfeitoMelancolicoCount++
                        BehaviorProfile.SERENO_FLEUMATICO -> serenoFleumaticoCount++
                    }
                    break
                }
            }
        }

        // TODO: refatorar e corrigir comportamento - esse código apenas "funciona" para um perfil com "vitória"
        val resultantBehaviorProfile = when {
            forteColericoCount > popularSanguineoCount && forteColericoCount > perfeitoMelancolicoCount && forteColericoCount > serenoFleumaticoCount -> BehaviorProfile.FORTE_COLERICO
            popularSanguineoCount > forteColericoCount && popularSanguineoCount > perfeitoMelancolicoCount && popularSanguineoCount > serenoFleumaticoCount -> BehaviorProfile.POPULAR_SANGUINEO
            perfeitoMelancolicoCount > forteColericoCount && perfeitoMelancolicoCount > popularSanguineoCount && perfeitoMelancolicoCount > serenoFleumaticoCount -> BehaviorProfile.PERFEITO_MELANCOLICO
            serenoFleumaticoCount > forteColericoCount && serenoFleumaticoCount > perfeitoMelancolicoCount && serenoFleumaticoCount > popularSanguineoCount -> BehaviorProfile.SERENO_FLEUMATICO
            else -> throw Exception("Não existe um vitorioso")
        }

        val popularSanguineoPercentage = (popularSanguineoCount / 40) * 100
        val forteColericoPercentage = (forteColericoCount / 40) * 100
        val perfeitoMelancolicoPercentage = (perfeitoMelancolicoCount / 40) * 100
        val serenoFleumaticoPercentage = (serenoFleumaticoCount / 40) * 100

        return ExamResult(
            behaviorProfileDescription = "TBD",
            behaviorProfile = resultantBehaviorProfile,
            forteColericoPercentage = forteColericoPercentage,
            popularSanguineoPercentage = popularSanguineoPercentage,
            perfeitoMelancolicoPercentage = perfeitoMelancolicoPercentage,
            serenoFleumaticoPercentage = serenoFleumaticoPercentage,
        )
    }
}