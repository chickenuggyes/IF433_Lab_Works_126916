package oop_126916_CarolineSandraChen.week03

fun main() {

    // === Test Employee ===
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 500000

    println("Gaji: ${e.salary}")

    e.increasePerformance()
    e.printStatus()

    println("Pajak yang harus dibayar: ${e.tax}")


    // === Test Weapon ===
    println("\n=== Test Weapon ===")

    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    println("Damage setelah set -50: ${weapon.damage}")

    weapon.damage = 9999
    println("Damage setelah set 9999: ${weapon.damage}")

    println("Tier Weapon: ${weapon.tier}")


    // === Test Player ===
    println("\n=== Test Player ===")

    val player = Player("Hero123")

    // ini harus ERROR kalau di-uncomment
    // println(player.xp)

    player.addXp(50)    // masih level 1
    player.addXp(60)    // total 110 → level up ke 2

    println("Level saat ini: ${player.level}")
}
