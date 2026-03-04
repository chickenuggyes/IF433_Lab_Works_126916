package OOP_126916_CarolineSandraChen.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }

    println("\n=== MATH HELPER ===")
    val math = MathHelper()
    println("Luas Persegi (sisi 4): ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (5 x 3): ${math.hitungLuas(5,3)}")
    println("Luas Lingkaran (r = 7): ${math.hitungLuas(7.0)}")
    println("\n=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet("Caroline", 50000.0)
    val creditCard = CreditCard("Caroline", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in paymentMethods) {
        method.processPayment(75000.0)

        if (method is EWallet) {
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }
    }
}