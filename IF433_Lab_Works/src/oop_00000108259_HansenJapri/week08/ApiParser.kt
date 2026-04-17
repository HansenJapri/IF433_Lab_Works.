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

    // Fungsi 2: UNTUK CHECKOUT (Ini yang bikin merah kalau belum ada)
    fun checkout(product: Product) {
        // Ekstrak ID berdasarkan tipe produk (Sealed Class)
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Memanggil service Java (Gunakan !! sesuai instruksi)
        val transactionId = JavaPaymentService.processPayment(id)!!

        println("Transaction ID: $transactionId")
    }
} // <--- Pastikan kurung tutup kelasnya ada di paling bawah