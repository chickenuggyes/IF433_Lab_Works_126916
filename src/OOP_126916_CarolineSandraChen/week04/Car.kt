package OOP_126916_CarolineSandraChen.week04

open class Car(brand: String, val numberofDoors: Int) : Vehicle(brand){
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberofDoors pintu dibuka")
    }
}
