package oop_00000108259_HansenJapri.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Speaker menyala. Menunggu perintah suara...")
    }

    override fun turnOff() {
        println("[$name] Speaker mati. Sampai jumpa!")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}