package OOP_126916_CarolineSandraChen.week07

fun main() {
    println("Server: ${Koneksi.test_koneksi()}")
    Koneksi.test_koneksi()

    Mahasiswa.nama = "Olin"
    val na:Int = Mahasiswa.set_nilai(80, 100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("UMN")

    val dsn1 = Dosen("Indah", "12356", 2020)
    println(dsn1)
    val dsn2 = dsn1.copy(nama = "Budi", nik = "32145")
    println(dsn2)
    //cara ambil satu satu
    println("Nama dosen1: ${dsn1.nama}, Masuk tahun ${dsn1.tahunMasuk}")

    //CALL ENUM CLASS
    println("Matkul favorit saya: " + MataKuliah.OOP.name)
    println("Index matkul: " + MataKuliah.OOP.ordinal)
    MataKuliah.OOP.sks_matkul()

    //looping muncul semua
    for(matkul in MataKuliah.entries){
        println("matkul: " + matkul)
        matkul.sks_matkul()
    }
}