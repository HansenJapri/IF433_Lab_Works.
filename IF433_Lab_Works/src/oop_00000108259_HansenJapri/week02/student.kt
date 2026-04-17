// Pastikan baris package ini sama persis di semua file dalam folder week02
package oop_00000108259_HansenJapri.week02

class Student (
    val name: String,
    val nim: String,
    var gpa: Double = 0.0, // Default Argument
    var major: String
) {
    init {
        // Validasi NIM 5 karakter
        if (nim.length != 5) {
            println("WARNING: NIM tidak valid!")
        } else {
            println("LOG: Objek $name berhasil dibuat.")
        }
    }

    // Secondary Constructor
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Jalur umum (Tanpa Jurusan).")
    }
}