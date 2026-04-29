package OOP_126916_CarolineSandraChen.week09

fun main(){
    println("=========== LIST OF IMUT ===========")
    val arSiswa = listOf("Budi", "Danu", "Susi", "Cica")
    //view
    println(arSiswa)

    //panjang array
    println("Banyak siswa: " + arSiswa.size)

    //munculin 1 orang aja
    println("Siswa bernama ${arSiswa[1]}")

    //for-each utk munculin semua orang
    for(a in arSiswa){
        println("Siswa " + a + " " + "dan ")
    }

    println("========== LIST OF MUTABLE ========== ")
    val arMatkul = mutableListOf("OOP", "Pemweb", "Matdis", "Kalkulus")
    arMatkul.add("Algo")
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove("Pemweb")
    println(arMatkul)

    println("========== SET OF IMUT ===========")
    var arNilai = setOf(80, 90, 75, 85, 80, 75, 50, 94)
    println("Banyak nilai: " + arNilai.size)
    println("ada angka 90 gak? ${arNilai.contains(90)}")
    println(arNilai)

    println("========== SET OF MUTABLE ===========")
    val arMahasiswa = mutableSetOf("Andi", "Olin", "Yuli", "Yuda")
    arMahasiswa.add("Yanti")
    arMahasiswa.remove("Yuli")
    arMahasiswa.add("Yuli")
    println(arMahasiswa)

    println("========== MAP IMUT ===========")
    val arResto = mapOf(
        "ayam" to 5000,
        "bakpao" to 3000,
        "sayur asem" to 2500
    )
    println("Banyak menu: ${arResto.size}")
    println("Harga ayam ${arResto["ayam"]}")
    println("List makanan ${arResto.keys}")
    println("List harga ${arResto.values}")
    println(arResto)

    println("========== MAP MUTABLE ===========")
    var arKHS = mutableMapOf(
        "Toni" to 80,
        "Olin" to 94,
        "Ara" to 87,
        "Davin" to 90
    )
    arKHS.remove("Ara")
    arKHS["Olin"] = 98
    arKHS["Carol"] = 100
    println(arKHS)

    println("========== LAMBDA ===========")
    //function biasa
    fun tambah(a:Int, b:Int): Int {
        return a + b
    }
    println("hasil penambahan adalah ${tambah(5, 3)}")

    //function lambda -> tulis kesamping
    val kurang = { a: Int, b: Int -> a - b}
    println("Hasil pengurangan adalah ${kurang(5, 3)}")

    println("========== LAMBDA { IT } ===========")
    val pangkat = {a: Int -> a*a}
    val hasilPangkat:(Int) -> Int = {it * it}
    println("Hasil pangkat adalah ${hasilPangkat(5)}")

    println("========== FOREACH BIASA =======")
    for(a in arMatkul){
        println(a)
    }

    println("========== FOREACh IT ==========")
    arMatkul.forEach{
        println(it)
    }

    println("========== FOREACH VARIABLE ==========")
    arMatkul.forEach{
        mk -> println(mk)
    }
}