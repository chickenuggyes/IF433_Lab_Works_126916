package OOP_126916_CarolineSandraChen.week07

class Mahasiswa private constructor(val kampus:String) {
    companion object {
        var nama:String = "unknown"
        fun set_nilai(uts:Int, uas:Int):Int {
            return (uts+uas)/2
        }
        fun isi_nama_kampus(namaUniv: String) {
            Mahasiswa(namaUniv)
        }
    }
    //bagian class biasa bukan companion object
    init{
        println("Nama kampus kamu $kampus")
    }
}