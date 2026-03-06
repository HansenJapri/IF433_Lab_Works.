package oop_00000108259_HansenJapri.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - EWallet] Pembayaran sukses! Saldo tersisa: Rp$balance")
        } else {
            println("[$accountName - EWallet] Gagal: Saldo tidak cukup (Saldo: Rp$balance)")
        }
    }

    // Fungsi spesifik hanya untuk EWallet
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - EWallet] Top Up Rp$amount berhasil. Saldo sekarang: Rp$balance")
    }
}