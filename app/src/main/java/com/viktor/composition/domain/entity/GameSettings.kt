package com.viktor.composition.domain.entity

data class GameSettings (
    val maxSumValue: Int,
    val minCountRightAnswer: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
    )