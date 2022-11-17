package com.garcia.pablo.personalityplus.model.entities

data class Option(
    var isChecked: Boolean = false,
    val featureName: String,
    val description: String,
    val behaviorProfile: BehaviorProfile
)
