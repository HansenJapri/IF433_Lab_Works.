package oop_00000108259_HansenJapri.week07

fun main() {
    // --- TEST SINGLETON & COMPANION OBJECT ---
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    // --- TEST DATA CLASS ---
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Memori hash [cite: 76]
    println("Sama? ${reg1 == reg2}") // False [cite: 76]

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Readable format [cite: 86]
    println("Sama? ${data1 == data2}") // True [cite: 87]

    // Immutability & Destructuring
    val data3 = data1.copy(age = 23)
    val (userName, userAge) = data1
    println("Hasil Copy: $data3")
    println("Destructured: $userName berumur $userAge")

    // --- TEST SEALED CLASS ---
    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = Success("Data berhasil ditarik!")
    val uiMessage = when (response) {
        is Success -> "Tampilkan: ${response.data}"
        is Error -> "Munculkan alert: ${response.message}"
            Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // --- TUGAS MANDIRI RPG SIMULATION ---
    println("\n=== SIMULASI GAME RPG ===")
    GameManager.startGame()
    GameManager.startGame()

    println("Drop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val myWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${myWeapon.item.name}, Durability: ${myWeapon.durability}")

    // Upgrade Senjata (Copy)
    val upgradedItem = myWeapon.item.copy(damage = 25)

    // Simulasi Event Berurutan
    processEvent(SafeZone)
    processEvent(MonsterEncounter("Goblin Nakal"))
    processEvent(LootDropped(upgradedItem))
    processEvent(GameOver("Terkena jebakan racun"))
}