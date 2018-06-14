package ch.teko.olten.android.todoapp.login.model

import ch.teko.olten.android.todoapp.login.model.repository.UserRepository
import ch.teko.olten.android.todoapp.login.view.LoginView

class AuthenticationService(private val view: LoginView) {

    val repository = UserRepository.getRepository()

    fun authenticate(username: String, password: String) {

        val user = repository.findUser(username)

        if (user != null && user.password.equals(password)) {
            view.userIsAllowed(username)
        } else {
            view.userIsNotAllowed(username)
        }


    }

}