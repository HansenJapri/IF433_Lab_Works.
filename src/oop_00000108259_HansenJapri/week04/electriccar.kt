package oop_00000108259_HansenJapri.week04

// ElectricCar "Is-A" Car. Parameter brand dan numberOfDoors dilempar ke Car
class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    // Mengunci implementasi agar tidak bisa di-override lagi oleh subclass ElectricCar
    final override fun accelerate() {
        // Implementasi murni tanpa memanggil super.accelerate()
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}