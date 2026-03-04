package OOP_126916_CarolineSandraChen.week05

class Admin(nama: String) : Pegawai(nama){
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWorkI(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}