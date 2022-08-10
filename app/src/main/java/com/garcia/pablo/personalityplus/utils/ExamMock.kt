package com.garcia.pablo.personalityplus.utils

import com.garcia.pablo.personalityplus.entities.BehaviorProfile
import com.garcia.pablo.personalityplus.entities.Exam
import com.garcia.pablo.personalityplus.entities.Option
import com.garcia.pablo.personalityplus.entities.Step

val options1 = listOf(
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options2 = listOf(
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val step1 = Step(
    options = options1
)

val step2 = Step(
    options = options2
)

val examMock = Exam(
    steps = listOf(
        step1,
        step2
    )
)