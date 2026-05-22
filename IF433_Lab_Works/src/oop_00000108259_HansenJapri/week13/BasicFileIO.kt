package oop_00000108259_HansenJapri.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: menambahkan konfigurasi baru\n")
    println("Teks berhasil di-append")


}