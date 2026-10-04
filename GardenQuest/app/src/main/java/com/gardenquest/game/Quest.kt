package com.gardenquest.game

data class QuestDef(
    val id: String,
    val title: String,
    val description: String,
    val target: Int,
    val rewardCoins: Int,
    val unlockCropId: String?,
    val progressProvider: (GameState) -> Int
)

object QuestRegistry {
    val ALL: List<QuestDef> = listOf(
        QuestDef("sprout","First Sprout","Plant your first seed",1,5,null) { it.totalPlanted },
        QuestDef("splash","First Splash","Water a growing crop",1,5,null) { it.totalWatered },
        QuestDef("reap","First Harvest","Harvest a crop",1,10,null) { it.totalHarvested },
        QuestDef("seller","Market Day","Sell 3 crops from your Inventory",3,15,"tomato") { it.totalSold },
        QuestDef("saver","Nest Egg","Earn 50 coins in total",50,10,"corn") { it.lifetimeCoins },
        QuestDef("helper","Hire Help","Assign your helper a task",1,10,null) { it.npcTasksAssigned },
        QuestDef("harvester","Green Thumb","Harvest 10 crops in total",10,20,"pumpkin") { it.totalHarvested },
        QuestDef("expand","Growing Grounds","Expand your farm once",1,15,null) { it.farmExpansions },
        QuestDef("tycoon","Garden Tycoon","Earn 200 coins in total",200,30,null) { it.lifetimeCoins }
    )
}
