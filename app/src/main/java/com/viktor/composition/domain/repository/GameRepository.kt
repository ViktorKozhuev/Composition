package com.viktor.composition.domain.repository

import com.viktor.composition.domain.entity.GameSettings
import com.viktor.composition.domain.entity.Level
import com.viktor.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings

}