package com.garcia.pablo.personalityplus.model.entities

import java.io.Serializable

data class Exam (
    val steps: List<Step>
) : Serializable