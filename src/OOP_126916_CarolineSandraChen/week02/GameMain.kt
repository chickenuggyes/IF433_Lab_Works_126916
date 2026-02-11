package OOP_126916_CarolineSandraChen.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)

    var enemyHp = 100

    println("\n=== BATTLE START ===")
    println("Enemy HP: $enemyHp | ${hero.name} HP: ${hero.hp}\n")

    while (hero.isAlive() && enemyHp > 0) {

        println("Pilih aksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = Random.nextInt(10, 21) // 10–20
                println("Enemy menyerang balik sebesar $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("${hero.name} memilih kabur! Pertarungan berakhir.")
            break
        } else {
            println("Pilihan tidak valid!")
        }

        println("--------------------------------")
    }

    println("\n=== HASIL PERTARUNGAN ===")
    when {
        enemyHp <= 0 -> println("${hero.name} MENANG! 🎉")
        !hero.isAlive() -> println("Enemy MENANG! 💀")
        else -> println("${hero.name} KABUR dari pertarungan.")
    }
}
