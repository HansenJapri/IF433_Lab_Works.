package oop_00000108259_HansenJapri.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, -12.5, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, 8.2, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 25, -2.5, "OPEN")
    )

    tradeHistory.forEach { trade ->
        if (trade.status == "CLOSED") {
            println("${trade.pair} | ${trade.position} | ${trade.leverage} | ${trade.roe} | ${trade.status}")
        }
    }
}