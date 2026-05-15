package oop_00000108259_HansenJapri.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}


fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Peringatan: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan: ${e.message}")
    } catch (e: Exception) {
        println("Peringatan: Terjadi kesalahan umum - ${e.message}")
    } finally {

        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println()


    println("=== JADWAL MAKAN SORE ===")
    currentKibbleStock = 1000

    val soreResult = runCatching {
        dispenseKibble(30, currentKibbleStock, false)
    }

    soreResult.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }

    println("\n=== FINAL STATUS ===")
    println("Sisa stok akhir: $currentKibbleStock gr")
}




