package oop_00000108259_HansenJapri.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCSV(): String = "$name, $age, $gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}


