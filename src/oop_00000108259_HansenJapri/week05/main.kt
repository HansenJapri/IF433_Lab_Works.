package oop_00000108259_HansenJapri.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }


    class MathHelper {
        fun hitungLuas(sisi: Int): Int {
            return sisi * sisi
        }

        fun hitungLuas(panjang: Int, lebar: Int): Int {
            return panjang * lebar
        }

        fun hitungLuas(jariJari: Double): Double {
            return 3.14 * jariJari * jariJari
        }
    }
}