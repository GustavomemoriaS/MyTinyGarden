package com.gardenquest.game

data class Crop(
    val id: String,
    val displayName: String,
    val seedCost: Int,
    val sellPrice: Int,
    val maxStage: Int,
    val stageDurationMs: Long,
    val unlockDescription: String
)

object CropRegistry {
    val ALL: List<Crop> = listOf(
        Crop("carrot","Carrot",2,5,3,20_000L,"Available from the start"),
        Crop("tomato","Tomato",5,12,3,35_000L,"Unlocks after selling 3 crops"),
        Crop("corn","Corn",10,22,4,50_000L,"Unlocks at 50 lifetime coins"),
        Crop("pumpkin","Pumpkin",20,45,4,75_000L,"Unlocks after 10 total harvests")
    )
    fun byId(id: String): Crop = ALL.firstOrNull { it.id == id } ?: ALL[0]
}
