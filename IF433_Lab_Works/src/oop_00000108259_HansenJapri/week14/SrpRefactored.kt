package oop_00000108259_HansenJapri.week14

import oop_00000108259_HansenJapri.week11.User

class UserValidator {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 10
}

class UserRepository {
    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}

class EmailService {
    fun sendWelcome(user: User) {
        println("Welcome email -> ${user.email}")
    }
}