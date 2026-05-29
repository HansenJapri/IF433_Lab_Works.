package oop_00000108259_HansenJapri.week14

import oop_00000108259_HansenJapri.week11.User

data class user(val name: String, val email: String, val age: Int)

class UserManager {

    fun validateUser(user: User): Boolean {
        return user.email.contains("@") && user.age >= 10
    }

    fun saveUserToDatabase(user: User) {
        println("INSERT INTO users VALUES (`${user.name}, `${user.email}`)")
    }

    fun sendWelcomeEmail(user: User) {
        println("Sending email to: ${user.email}")
    }


}