package OOP_126916_CarolineSandraChen.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// Extension function dengan nullable receiver
fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}