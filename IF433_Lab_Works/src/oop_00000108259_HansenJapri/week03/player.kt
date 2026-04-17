package oop_00000108259_HansenJapri.week03

class Player(val username: String) {
    // 2. Properti XP Privat (Hanya bisa diakses di dalam class ini)
    private var xp: Int = 0

    // 3. Level sebagai Computed Property
    // Dihitung otomatis setiap kali dipanggil berdasarkan nilai XP saat ini
    val level: Int
        get() = (xp / 100) + 1

    // 4. Function untuk menambah XP secara aman
    fun addXp(amount: Int) {
        if (amount > 0) {
            // Simpan level lama sebelum XP ditambah untuk pengecekan Level Up
            val levelSebelumnya = level

            xp += amount
            println("[SYSTEM] $username mendapatkan $amount XP. (Total XP: $xp)")

            // Cek apakah level sekarang lebih tinggi dari level sebelumnya
            if (level > levelSebelumnya) {
                println(">>> Level Up! Selamat $username naik ke level $level <<<")
            }
        } else {
            println("[WARNING] Amount XP harus positif!")
        }
    }
}