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

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    println("CLOSED TRADES")
    closedTrades.forEach { trade ->
        println("${trade.pair} | ${trade.position} | ${trade.leverage} | ${trade.roe} | ${trade.status}")
    }


    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("WINNING TRADES")
    winningTrades.forEach { trade ->
        println("${trade.pair} | ${trade.position} | ${trade.leverage} | ${trade.roe} | ${trade.status}")
    }


    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("LOSING TRADES")
    losingTrades.forEach { trade ->
        println("${trade.pair} | ${trade.position} | ${trade.leverage} | ${trade.roe} | ${trade.status}")
    }



    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { trade ->
            "WIN [${trade.pair} - ${trade.position}]: +${trade.roe}% ROE (Lev: ${trade.leverage}x)"
    }

    println("\ntop perfomers string")
    topPerformersString.forEach { println(it) }
}