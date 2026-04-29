package OOP_126916_CarolineSandraChen.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)