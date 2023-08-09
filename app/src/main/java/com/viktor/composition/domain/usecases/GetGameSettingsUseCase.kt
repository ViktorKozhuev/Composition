package com.viktor.composition.domain.usecases

import com.viktor.composition.domain.entity.GameSettings
import com.viktor.composition.domain.entity.Level
import com.viktor.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}