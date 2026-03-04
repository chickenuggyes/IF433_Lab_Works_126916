package OOP_126916_CarolineSandraChen.week05

class MatakuliahElektif: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Matkul ${super.nama} sks-nya $sks")
    }

    fun ada_praktek(){
        println("wajib dipraktekin")
    }
}