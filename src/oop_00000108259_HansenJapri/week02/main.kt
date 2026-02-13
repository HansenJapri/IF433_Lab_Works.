package oop_001_johnthor.week02

import java.util.Scanner

// Class didefinisikan di luar main
class Student(val name: String, val nim: String, var major: String) {

    // LANGKAH 4: Secondary Constructor berada di dalam body class
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan (Kosongkan jika belum ada): ")
        val major = scanner.nextLine()

        if (major.isEmpty()) {
            // Memanggil Secondary Constructor
            val s1 = Student(name, nim)
        } else {
            // Memanggil Primary Constructor
            val s1 = Student(name, nim, major)
        }
        println("Status: Pendaftaran Selesai.")
    }
}