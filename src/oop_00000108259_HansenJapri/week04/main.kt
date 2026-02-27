package oop_00000108259_HansenJapri.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()


    println("\n--- Testing Electric Car ---")
    val myEV = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 85)
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()


    val manager = Manager("Budi", 8000000)
    val developer = Developer("Hansen", 7000000, "Kotlin")

    println("=== Data Manager ===")
    manager.work()
    println("Bonus: Rp ${manager.calculateBonus()}")

    println("\n=== Data Developer ===")
    developer.work()
    println("Bonus: Rp ${developer.calculateBonus()}")
}