package ch.teko.olten.android.todoapp.login.model.repository.inmemory

import ch.teko.olten.android.todoapp.login.model.User
import ch.teko.olten.android.todoapp.login.model.repository.UserRepository

class InMemoryUserRepository : UserRepository {

    val users = arrayListOf<User>()

    override fun findUser(username: String) : User? {
        return users.find { user ->
            username.equals(user.username)
        }
    }

    override fun createUser(username: String, password: String): User? {
        if (findUser(username) != null) {
            return null
        }
        val user = User(UserIdGenerator.generateId(), username, password)
        users.add(user)
        return user
    }
}