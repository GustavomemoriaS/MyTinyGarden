package com.gardenquest.game

enum class PlotState { EMPTY, GROWING, READY }

class Plot(
    var state: PlotState = PlotState.EMPTY,
    var cropId: String? = null,
    var stage: Int = 0,
    var watered: Boolean = false,
    var stageStartedAt: Long = 0L,
    var unlocked: Boolean = false
)
