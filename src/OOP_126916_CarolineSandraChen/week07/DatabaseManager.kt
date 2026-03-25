package OOP_126916_CarolineSandraChen.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}