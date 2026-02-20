package oop_00000108259_HansenJapri.week02

import java.util.Scanner

// Spesifikasi Class Hero
class Hero(val name: String, val baseDamage: Int, var hp: Int = 100) {

    // Method untuk simulasi serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Method untuk menerima damage dengan logika HP minimal 0
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0 // Paksa menjadi 0 jika tembus minus
        }
    }

    // Method mengecek status hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== WELCOME TO MINI RPG BATTLE ===")

    // 1. Inisialisasi Hero
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val myHero = Hero(heroName, damage)

    // 2. Inisialisasi Musuh
    var enemyHp = 100
    val enemyName = "Wild Slime"

    println("\nSeekor $enemyName muncul! (HP: $enemyHp)")

    // 3. Main Loop (State Management)
    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- STATUS ---")
        println("${myHero.name} HP: ${myHero.hp} | $enemyName HP: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilihan: ")

        when (scanner.nextInt()) {
            1 -> {
                // Hero menyerang
                myHero.attack(enemyName)
                enemyHp -= myHero.baseDamage
                println("Damage masuk: ${myHero.baseDamage}. Sisa HP Musuh: $enemyHp")

                // Musuh membalas jika masih hidup
                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("$enemyName membalas dengan $enemyDamage damage!")
                    myHero.takeDamage(enemyDamage)
                    println("Sisa HP ${myHero.name}: ${myHero.hp}")
                }
            }
            2 -> {
                println("${myHero.name} memilih kabur dari pertarungan!")
                break // Paksa loop berhenti
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    // 4. Pengumuman Pemenang
    println("\n=== PERTARUNGAN SELESAI ===")
    if (!myHero.isAlive()) {
        println("${myHero.name} telah gugur. GAME OVER.")
    } else if (enemyHp <= 0) {
        println("$enemyName berhasil dikalahkan! VICTORY.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Kabur).")
    }
}