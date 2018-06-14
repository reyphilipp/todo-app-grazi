package ch.teko.olten.android.todoapp.login.view

interface LoginView {

    fun userIsNotAllowed(username: String)

    fun userIsAllowed(username: String)
}