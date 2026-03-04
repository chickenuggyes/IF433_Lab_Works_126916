package OOP_126916_CarolineSandraChen.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama){
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan mengisi RPKPS.")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}