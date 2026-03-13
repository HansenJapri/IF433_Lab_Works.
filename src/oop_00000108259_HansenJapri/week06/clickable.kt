package oop_00000108259_HansenJapri.week06

interface Clickable {
    // Properti abstrak (tanpa nilai default)
    // Kelas yang mengimplementasikan ini wajib memberikan nilai
    val name: String

    // Fungsi abstrak (tanpa body)
    fun click()
}

