package oop_00000108259_HansenJapri.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 14.8))
    coinRepo.add(Coin("USDT", 2500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Network Status: ${response.status}")
    response.data.forEach { coin ->
        println("Asset Name: ${coin.name} | Current Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-99821", 0.05))
    txRepo.add(Transaction("TX-99822", 2.10))

    println("\n=== TRANSACTION HISTORY LOG ===")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} -> Amount Traded: ${tx.amount}")
    }

    println("\n=== TESTING SEARCH FUNCTION ===")
    val searchResult = coinRepo.search("BTC")
    searchResult.forEach { println("Found search match: ${it.name} with balance ${it.balance}") }

    println("\nAll architecture structures ran flawlessly without any runtime type-mismatch exceptions.")
}