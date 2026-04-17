package oop_00000108259_HansenJapri.week03

class Employee(val name: String) {

    // 1. Validation dengan Backing Field
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    // 2. Encapsulation: Properti Privat
    private var performanceRating: Int = 3

    // 3. Computed Property (Pajak 10%)
    // Properti ini tidak menyimpan data, tapi dihitung setiap kali dipanggil
    val tax: Double
        get() = salary * 0.1

    // --- Methods ---

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating, Gaji: $salary, Pajak: $tax")
    }
}