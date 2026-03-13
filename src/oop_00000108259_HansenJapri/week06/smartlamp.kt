package oop_00000108259_HansenJapri.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Lampu menyala. Suasana menjadi terang!")
    }

    override fun turnOff() {
        println("[$name] Lampu mati. Hemat energi!")
    }
}