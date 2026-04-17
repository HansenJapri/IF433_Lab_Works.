package oop_00000108259_HansenJapri.week03

fun main() {
    val sword = Weapon("Excalibur")
    println("--- Mengamankan Senjata: ${sword.name} ---")


    sword.damage = 100
    println("Damage Awal: ${sword.damage} (${sword.tier})")

    println("\n[Uji Coba 1: Set Damage ke -50]")
    sword.damage = -50 // Harus gagal dan tetap 100
    println("Damage Sekarang: ${sword.damage}")

    println("\n[Uji Coba 2: Set Damage ke 9999]")
    sword.damage = 9999 // Harus dipaksa menjadi 1000
    println("Damage Sekarang: ${sword.damage}")

    println("\n[Hasil Akhir]")
    println("Weapon: ${sword.name}")
    println("Final Damage: ${sword.damage}")
    println("Final Tier: ${sword.tier}")
}