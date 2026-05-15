package oop_00000108259_HansenJapri.week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}

fun main() {

    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    val result: Int = try {
        inputString.toInt()
    } catch (e: NumberFormatException) {
        -1
    }

    println("Hasil parsing: $result")

    println("\n=== TEST BASIC TRY-CATCH ===")
    println("Hasil: ${divide(10, 0)}")
}