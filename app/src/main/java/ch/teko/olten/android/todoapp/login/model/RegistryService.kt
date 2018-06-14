package ch.teko.olten.android.todoapp.login.model

import ch.teko.olten.android.todoapp.login.model.repository.UserRepository
import ch.teko.olten.android.todoapp.login.view.RegisterView

class RegistryService(private val view: RegisterView) {

    val repository = UserRepository.getRepository()

    fun registerUser(username: String, password: String) {

        val user = repository.createUser(username, password)

        if (user == null) {
            view.userIsNotRegistrated(username)
        } else {
            view.userIsRegistrated(username)
        }

    }
}