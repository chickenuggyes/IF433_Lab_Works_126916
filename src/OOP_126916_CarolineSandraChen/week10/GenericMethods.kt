package OOP_126916_CarolineSandraChen.week10

fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

fun <T> processData(input: T): T {
    return input
}

fun <T> getMaximum(value1: T, value2: T): T where T : Comparable<T> {
    return if (value1 >= value2) value1 else value2
}