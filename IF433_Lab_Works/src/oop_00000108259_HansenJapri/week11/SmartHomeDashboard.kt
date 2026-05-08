package oop_00000108259_HansenJapri.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val philipsLamp = SmartDevice(name = "", category = "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    println("Perangkat berhasil ditambahkan: ${homeDevices.first()}")
}