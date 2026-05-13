package OOP_126916_CarolineSandraChen.week11

//function biasa
fun panggil_nama(nama:String):String{
    return "Hai $nama"
}

//function extension - BASIC
fun String.panggil_mahasiswa(): String {
    val hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercaseChar()
        }
    }
    return hasil
}

//function extension - PARAMETER
fun Int.tentukanLulus(nama:String):String{
    var keputusan = ""
    if(this >= 70) {
        keputusan = "Lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

//function extension - cek NULL
fun String?.cekNulldanEmpty():String{
    if(this == null || this.isEmpty()){
        return "Gak boleh null atau kosong"
    } else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa(){
    var nim:String = ""
    var nama:String = ""
    var ipk:Double = 0.0
}

fun main(){
    //cara panggil function extension - NULL
    var inputUsername:String? = "Carolin"
    println(inputUsername.cekNulldanEmpty())

    //cara panggil function extension - PARAMETER
    println(80.tentukanLulus("Revand"))

    //cara panggil function biasa
    println(panggil_nama("Olin").uppercase())

    //cara panggil function extension - BASIC
    println("tonyyy stark iron man".panggil_mahasiswa())

    //SCOPE - LET
    var kampusSaya = "UMN"
    kampusSaya.let{
        if(it == "UMN") {
            println("Kampus " + it + " keren")
        } else {
            println("Amazing $it")
        }
    }

    //SCOPE - RUN
    var alamatSaya = "Gading Serpong"
    alamatSaya.run{
        println("Saya tinggal di " + this)
    }

    //SCOPE - WITH
    var gradeSaya = with(90){
        if(this>=80){
            "A"
        } else if (this>=70){
            "B"
        } else {
            "C"
        }
    }
    println("Grade kamu adalag $gradeSaya")

    //SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply{
        nama = "Yudi"
        nim = "12345"
        ipk = 3.93
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipk nya ${dataMahasiswa.ipk}")

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80, 70, 75, 85, 65)
    deretAngka.also{
        println("Sebelum $deretAngka")
    }.add(90)
    println("Setelah $deretAngka")
}