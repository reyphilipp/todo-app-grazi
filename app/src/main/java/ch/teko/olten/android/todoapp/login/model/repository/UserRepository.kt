package ch.teko.olten.android.todoapp.login.model.repository

import ch.teko.olten.android.todoapp.login.model.User
import ch.teko.olten.android.todoapp.login.model.repository.inmemory.InMemoryUserRepository

interface UserRepository {

    fun findUser(username:String): User?

    fun createUser(username: String, password: String) : User?

    companion object {

        private val repository = InMemoryUserRepository()

        fun getRepository() : UserRepository {
            return repository
        }

    }

}