package oop_00000108259_HansenJapri.week14

class MySqlDatabase {
    fun query(sql: String): List<String> = listOf("data1","data2")
}

class UserService {
    private val database = MySqlDatabase()
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id=$id")
}
