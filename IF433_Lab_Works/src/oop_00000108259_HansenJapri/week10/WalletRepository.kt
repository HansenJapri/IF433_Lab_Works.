package oop_00000108259_HansenJapri.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(query: String): List<T> {
        return items.filter { item ->
            when (item) {
                is Coin -> item.name.contains(query, ignoreCase = true)
                is Transaction -> item.id.contains(query, ignoreCase = true)
                else -> false
            }
        }
    }
}