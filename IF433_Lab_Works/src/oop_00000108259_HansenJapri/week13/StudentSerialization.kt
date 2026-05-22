package oop_00000108259_HansenJapri.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCSV(): String = "$name, $age, $gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(
        parts[0].trim(),
        parts[1].trim().toInt(),
        parts[2].trim().toDouble()
    )
}

fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString("\n") { it.toCSV() })
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}