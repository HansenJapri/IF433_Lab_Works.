package oop_00000108259_HansenJapri.week08

class ApiParser {
    // Fungsi 1: Untuk parsing data JSON kotor
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warrantyMonths"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        // 1. Cetak detail spesifik produk sebelum transaksi
        when (product) {
            is Electronic -> println("Processing: ${product.name} (Warranty ${product.warrantyMonths} Months)")
            is Clothing -> println("Processing: ${product.name} (Size ${product.size})")
        }

        // 2. Ekstrak ID untuk dikirim ke Java
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // 3. Panggil Java service (Tetap pakai !! sesuai tugas)
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Transaction ID: $transactionId\n") // Tambah \n biar rapi ada jarak
    }
} // <--- Pastikan kurung tutup kelasnya ada di paling bawah