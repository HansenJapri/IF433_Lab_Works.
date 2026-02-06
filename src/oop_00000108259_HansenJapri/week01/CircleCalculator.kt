package oop_00000108259_HansenJapri.week01

fun main(args: Array<String>) {
// Variable definition
    val radius: Double = 7.0
    val pi: Double = 3.14
// Calculation
    val area: Double = pi * radius * radius
// Output Concatenation
    println("Radius: $radius , Area: $area")
    // Logic check
    fun checkSize(area: Double) {
        if (area > 100) {
            println("This is a Big Circle")
        } else {
            println("This is a Small Circle")
        }
    }
}