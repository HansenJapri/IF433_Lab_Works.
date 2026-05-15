package oop_00000108259_HansenJapri.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")


class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }

        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}




