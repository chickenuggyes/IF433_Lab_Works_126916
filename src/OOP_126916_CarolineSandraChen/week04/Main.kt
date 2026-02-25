package OOP_126916_CarolineSandraChen.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")

    val myElectricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 85
    )

    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Budi", 10_000_000)
    manager.work()
    println("Bonus ${manager.name}: ${manager.calculateBonus()}")

    val developer = Developer("Siti", 8_000_000, "Kotlin")
    developer.work()
    println("Bonus ${developer.name}: ${developer.calculateBonus()}")
}