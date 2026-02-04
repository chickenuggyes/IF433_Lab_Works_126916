package OOP_126916_CarolineSandraChen.week01

fun main() {
    val gameTitle = "Game Title"
    val price = 600000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        price - (price * 20 / 100)
    } else {
        price - (price * 10 / 100)
    }