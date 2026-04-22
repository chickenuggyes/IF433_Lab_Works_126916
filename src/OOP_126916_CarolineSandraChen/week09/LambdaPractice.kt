package OOP_126916_CarolineSandraChen.week09

fun main(){
    println("=== TEST LAMBDA ===")

    // Lambda eksplisit
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // Lambda implicit it
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}
