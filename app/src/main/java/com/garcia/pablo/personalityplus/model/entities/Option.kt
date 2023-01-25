package com.garcia.pablo.personalityplus.model.entities

import java.io.Serializable

data class Option(
    var isChecked: Boolean = false,
    val featureName: String,
    val description: String,
    val behaviorProfile: BehaviorProfile
) : Serializable
