package oop_00000108259_HansenJapri.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Muncul monster: ${event.monsterName}!")
        is LootDropped -> {
            // Destructuring atau Smart Cast [cite: 177]
            val (name, _, rarity) = event.item
            println("Mendapat loot: $name dengan rarity $rarity!")
        }
        is GameOver -> println("Permainan Berakhir: ${event.reason}")
        SafeZone -> println("Memasuki area aman. Harap beristirahat.")
    }
}