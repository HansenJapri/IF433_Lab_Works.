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

    val ezvizCamera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }


    val acInverter = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acInverter)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))



    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {

        println(it.diagnose())
    }


    with(homeDevices) {
        println("=== SMART HOME DASHBOARD SUMMARY ===")
        println("Total perangkat terdaftar: ${this.size} perangkat")
    }



    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("Total Konsumsi Daya: $totalPower Watt")


    println("\n=== MEMULAI DIAGNOSTIK SELURUH PERANGKAT ===")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }

}