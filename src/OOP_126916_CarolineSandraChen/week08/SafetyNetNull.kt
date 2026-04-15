package OOP_126916_CarolineSandraChen.week08

fun main(){
    var nama:String? = "susi"

    try{
        println("nama kamu ${nama!!.uppercase()}")
    } catch(ex: Exception){
        println("errornya adalah ${ex.message}")
    }

    var dataMhs: List<Any> = listOf(123, "Caroline", 89, "Tangerang")
    for(item in dataMhs){
        var itemFilter = item as? String
        if(itemFilter!= null) {
            println(itemFilter)
        }
    }
}