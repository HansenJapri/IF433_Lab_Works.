package oop_00000108259_HansenJapri.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Berhasil menambahkan: ${device.name}")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff() // Smart Casting otomatis ke Switchable
            }
        }
    }

    fun activateSecurityMode() {
        println("\n=== MENGAKTIFKAN MODE KEAMANAN ===")
        for (device in devices) {
            // Cek jika bisa merekam
            if (device is Recordable) {
                device.startRecord()
            }
            // Cek jika speaker untuk bunyi sirine
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}