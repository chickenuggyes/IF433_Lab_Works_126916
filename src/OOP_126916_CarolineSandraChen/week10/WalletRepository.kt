package OOP_126916_CarolineSandraChen.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter { item ->
            if (item is Named) {
                item.name.contains(keyword, ignoreCase = true)
            } else {
                false
            }
        }
    }
}
