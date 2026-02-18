package oop_126916_CarolineSandraChen.week03

fun main() {

    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    e.printStatus()

    println("Pajak yang harus dibayar: ${e.tax}")

    // === TEST WEAPON ===
    println("\n=== Test Weapon ===")

    val w = Weapon("Excalibur")

    w.damage = -50
    println("Damage setelah set -50: ${w.damage}")

    w.damage = 9999
    println("Damage setelah set 9999: ${w.damage}")

    println("Tier Weapon: ${w.tier}")
}
