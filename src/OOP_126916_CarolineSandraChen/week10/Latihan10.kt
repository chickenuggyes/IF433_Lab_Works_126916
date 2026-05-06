package OOP_126916_CarolineSandraChen.week10


//code non-Generic
class rumah (val alamat: Any)

//code Generic
class kampus<T>(val alamat:T)

//class generic - multi parameter
class Komputer<T, V>(val merk:T, val barcode:V)

//code generic - function
fun <T> Password(isiPass:T): T {
    return isiPass
}

fun main() {
    println("===== GENERIC - FUNCTION =====")
    Password(12345)
    println("Password kamu: " + Password(12345))

    println("===== SAMPLE GENERIC - MULTI PARAMETER ======")
    val komp = Komputer("dell", 12345)
    println("Merk Komputer: " + komp.merk)
    println("Barcode Komputer: " + komp.barcode)

    println("===== SAMPLE NON GENERIC =====")
    val rmh = rumah(alamat = 300)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("===== SAMPLE GENERIC =====")
    val kmps = kampus(alamat = 300)
    println(kmps.alamat + 50)
}