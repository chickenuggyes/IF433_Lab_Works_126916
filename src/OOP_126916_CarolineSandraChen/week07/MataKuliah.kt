package OOP_126916_CarolineSandraChen.week07

enum class MataKuliah (val jmlSks:Int){
    OOP(3),
    GAMEDEV(3),
    DASPRO(2);

    fun sks_matkul(){
        println("jumlah sks-nya: $jmlSks")
    }
}