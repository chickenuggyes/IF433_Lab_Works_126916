package oop_126916_CarolineSandraChen.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // ini akan meledakkan program (StackOverflow)
}
