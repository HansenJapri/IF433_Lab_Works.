package oop_00000108259_HansenJapri.week01

fun main() {
    val title = "SteamKW Game"
    val originalPrice = 5_000_000
    val discountPercent = if (originalPrice > 500_000) 20 else 10
    val finalPrice = calculateFinalPrice(
        originalPrice = originalPrice,
        discountPercent = discountPercent
    )

    printReceipt(
        title = title,
        originalPrice = originalPrice,
        finalPrice = finalPrice
    )
}

private fun calculateFinalPrice(originalPrice: Int, discountPercent: Int): Int {
    val discountAmount = originalPrice * discountPercent / 100
    return originalPrice - discountAmount
}

private fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("Judul: $title")
    println("Harga Asli: ${formatRupiah(value = originalPrice)}")
    println("Harga Akhir: ${formatRupiah(value = finalPrice)}")
}

private fun formatRupiah(value: Int): String {
    val formatted = String.format("%,d", value).replace(',', '.')
    return "Rp $formatted"
}
