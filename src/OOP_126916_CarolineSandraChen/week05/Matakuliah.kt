package OOP_126916_CarolineSandraChen.week05

abstract class Matakuliah {
    var nama:String = ""
    abstract fun set_matkul(sks:Int)

    fun hasil_matkul(){
        println("Matkul diminati: ")
    }
}