package oop_00000108259_HansenJapri.week02 // Sesuaikan dengan package kamu
import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== LIBRARY FINE SYSTEM ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrowerName = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: Lama pinjam tidak boleh minus
    if (duration < 0) {
        println("SISTEM: Durasi tidak valid ($duration), otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // Membuat objek Loan
    val currentLoan = Loan(title, borrowerName, duration)

    // Menampilkan Detail
    println("\n--- Detail Peminjaman ---")
    println("Buku           : ${currentLoan.bookTitle}")
    println("Peminjam       : ${currentLoan.borrower}")
    println("Durasi Pinjam  : ${currentLoan.loanDuration} hari")

    val fine = currentLoan.calculateFine()
    println("Total Denda    : Rp $fine")

    if (fine > 0) {
        println("Status         : Terlambat ${currentLoan.loanDuration - 3} hari.")
    } else {
        println("Status         : Tepat waktu.")
    }
}