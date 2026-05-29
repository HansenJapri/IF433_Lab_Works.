interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        FileWriter(file, true).use { writer ->
            writer.write("$itemName, $finalPrice, $customerType\n")
        }
    }
}


interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}