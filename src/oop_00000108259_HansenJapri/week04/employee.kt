package oop_00000108259_HansenJapri.week04

// Parent class harus 'open' agar bisa diwariskan
open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        // Mengembalikan 10% dari gaji pokok
        return (baseSalary * 0.1).toInt()
    }
}