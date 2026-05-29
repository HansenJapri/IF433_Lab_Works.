package oop_00000108259_HansenJapri.week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int): Shape {
    override fun area() = width * height
}

class SafeSquare(var side: Int): Shape {
    override fun area() = side * side
}