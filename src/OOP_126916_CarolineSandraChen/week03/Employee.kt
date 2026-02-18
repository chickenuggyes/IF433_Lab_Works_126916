package oop_126916_CarolineSandraChen.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH & BERBAHAYA!
            // Memanggil setter di dalam setter (rekursif)
            this.salary = value
        }
}
