package com.gardenquest.game

enum class NpcTask { NONE, PLANT, WATER, HARVEST }
enum class NpcState { IDLE, MOVING, WORKING }

class Npc(startX: Float, startY: Float) {
    var task: NpcTask = NpcTask.NONE
    var state: NpcState = NpcState.IDLE
    var x: Float = startX
    var y: Float = startY
    var targetPlotIndex: Int = -1
    var workStartedAt: Long = 0L
    var statusText: String = "Helper: Idle"
}
