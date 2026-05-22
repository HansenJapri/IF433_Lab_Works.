package oop_00000108259_HansenJapri.week13

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)


fun TradeRecord.toCsv(): String {
    return "$id, $symbol, $type, $margin, $pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {

        val parts = line.split(",")

        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}


fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}


fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {

        println("Error: File tidak ditemukan!")
        emptyList()
    }
}



fun main() {
    val simulatedTrades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 50.0, pnl = 15.5), [cite: 129, 157, 158]
    TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 30.0, pnl = -5.2) [cite: 129, 157, 158]
    )

    saveTrades(simulatedTrades, "crypto_trades.csv") [cite: 158]
    println("Berhasil menginisialisasi dan menyimpan data trade simulasi.")
}
