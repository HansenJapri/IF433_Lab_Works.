package oop_00000108259_HansenJapri.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: menambahkan konfigurasi baru\n")
    println("Teks berhasil di-append")


    println("=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi index $index: $line")
    }
}