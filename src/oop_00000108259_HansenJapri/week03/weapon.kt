package oop_00000108259_HansenJapri.week03

class Weapon(val name: String) {
    // Properti damage dengan aturan setter khusus
    var damage: Int = 0
        set(value) {
            when {
                // Aturan 1: Tidak boleh negatif (nilai tidak berubah)
                value < 0 -> {
                    println("[SECURITY WARNING] Damage tidak boleh negatif! Nilai tetap: $field")
                }
                // Aturan 2: Maksimal 1000 (Overpowered protection)
                value > 1000 -> {
                    println("[SYSTEM] Damage $value terlalu OP! Paksa set ke 1000.")
                    field = 1000
                }
                // Jika valid, simpan ke field
                else -> {
                    field = value
                }
            }
        }

    // Properti tier sebagai Computed Property (Getter-only)
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}