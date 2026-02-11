package OOP_126916_CarolineSandraChen.week02

class Pemain {
    var nama:String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    init {
        nama = "Messi";
        println("Ini adalah constructor");
    }

    constructor(alias:String="Budi", kecepatan:Int=8) {
        nama = alias;
        speed = kecepatan;
        println("Ini constructor kedua");
    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola");
    }
}

fun main(){
    val player = Pemain(alias = "Yoel", kecepatan = 100);
    player.bawa_bola();
    player.nama = "Udin";
    player.speed = 77;
    println("nama pemain: ${player.nama}");
    println("skill kecepatan: " + player.speed);

    val player2 = Pemain(alias = "Ronaldo", kecepatan = 100);
    println("pemain populer: ${player2.nama}");
    println("kecepatan: " + player2.speed);
    
}


