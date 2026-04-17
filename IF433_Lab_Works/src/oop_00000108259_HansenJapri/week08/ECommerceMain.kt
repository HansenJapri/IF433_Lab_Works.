package oop_00000108259_HansenJapri.week08

fun main() {
    // 1. Data kotor JSON sesuai instruksi
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    // 2. Instansiasi ApiParser
    val parser = ApiParser()

    println("=== STARTING BATCH COLLECTION PROCESS ===")

    // 3. Iterasi data
    for (raw in rawApiData) {
        try {
            // 4. Bungkus pemanggilan dengan try-catch untuk menangkap requireNotNull
            val product = parser.parseProduct(raw)

            // 5. Jika sukses dan tidak null, panggil checkout
            product?.let {
                parser.checkout(it)
            } ?: println("Log: Skipping unknown product type.")

        } catch (e: IllegalArgumentException) {
            // 6. Cetak peringatan log jika data korup (ID atau Name hilang)
            println("ALERTLOG: Data Korup ditemukan! -> ${e.message}")
        }
    }

    println("=== PROCESS COMPLETED ===")
}