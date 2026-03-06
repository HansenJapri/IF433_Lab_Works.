package oop_00000108259_HansenJapri.week05

abstract class PaymentMethod(val accountName: String) {
    // Abstract function yang harus diisi oleh class anak
    abstract fun processPayment(amount: Double)
}

