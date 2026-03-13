package oop_00000108259_HansenJapri.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] Sistem CCTV aktif.")
        // Otomatis merekam saat dinyalakan sesuai instruksi tugas
        startRecord()
    }

    override fun turnOff() {
        println("[$name] Sistem CCTV non-aktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Lensa berputar... Memulai perekaman video...")
    }
}