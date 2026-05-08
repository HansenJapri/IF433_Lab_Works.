package oop_00000108259_HansenJapri.week11

data class User(var nama: String = "", var age: Int = 0)


fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        nama = "Alex"
        age = 25
    }
    println(user)
}