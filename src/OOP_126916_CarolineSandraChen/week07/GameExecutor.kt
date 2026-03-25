package OOP_126916_CarolineSandraChen.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Siapkan pertarungan.")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot didapat: $name | Damage: $damage | Rarity: $rarity")
        }

        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di Safe Zone. Aman sejenak.")
        }
    }
}