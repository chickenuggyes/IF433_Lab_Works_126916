package oop_126916_CarolineSandraChen.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    // PRIVATE PROPERTY (tidak bisa diakses dari luar class)
    private var performanceRating: Int = 3

    // PUBLIC FUNCTION untuk ubah rating secara aman
    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    // FUNCTION untuk melihat status
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}
