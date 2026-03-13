package oop_00000108259_HansenJapri.week06

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicitly Abstract)
    fun click()


}

