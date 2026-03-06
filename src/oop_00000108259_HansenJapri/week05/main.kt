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




    val myWallet = EWallet(accountName = "Alex", balance = 50000.0)
    val myCard = CreditCard(accountName = "Alex", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(myWallet, myCard)

    val tagihan = 75000.0
    println("Tagihan belanja: Rp$tagihan")
    println("========================================")

    for (metode in daftarPembayaran) {
        println("\nMencoba membayar dengan: ${metode.javaClass.simpleName}")

        metode.processPayment(tagihan)

        if (metode is EWallet) {
            println("-> Sistem mendeteksi E-Wallet. Menjalankan prosedur otomatis...")

            metode.topUp(50000.0)

            println("-> Mencoba pembayaran ulang...")
            metode.processPayment(tagihan)
        }
    }
}