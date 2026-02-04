package OOP_126916_CarolineSandraChen.week01

fun main() {
    var name: String = "Caroline Sandra"
    var score: Int = 80

    println("Nama: " + name + ", Nilai: " + score)
}

fun main() {
    var name = "Caroline Sandra"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
}


