package oop_00000108259_HansenJapri.week03

fun main() {
    val player = Player("HansenGamer")
    println("\n=== Memulai Petualangan Player: ${player.username} ===")


    println("Status Awal - Level: ${player.level}")


    println("\n[Aksi: Menambah 50 XP]")
    player.addXp(50)
    println("Level Sekarang: ${player.level}")


    println("\n[Aksi: Menambah 60 XP]")
    player.addXp(60)
    println("Level Sekarang: ${player.level}")
}