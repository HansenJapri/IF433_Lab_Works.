package oop_00000108259_HansenJapri.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }
        val type = rawJson["type"] as? String

        return when(type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warrantyMonths"] as? Int ?: 12
                Electronic(name, id, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(name, id, size)
            }

            else -> null

        }
    }
}