package oop_126916_CarolineSandraChen.week03

fun main() {

    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    e.printStatus()

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")

}
