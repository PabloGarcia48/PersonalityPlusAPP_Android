package com.garcia.pablo.personalityplus.model.entities

data class ExamResult(
    val behaviorProfileDescription: String,
    val behaviorProfile: BehaviorProfile,
    val popularSanguineoPercentage: Int,
    val forteColericoPercentage: Int,
    val perfeitoMelancolicoPercentage: Int,
    val serenoFleumaticoPercentage: Int,
)
