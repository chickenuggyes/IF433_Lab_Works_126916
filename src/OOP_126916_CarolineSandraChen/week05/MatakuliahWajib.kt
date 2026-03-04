package OOP_126916_CarolineSandraChen.week05

class MatakuliahWajib: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP"
        println("Matkul ${super.nama} sks-nya $sks")
    }

    fun ada_seminar(){
        println("wajib ada seminar")
    }
}