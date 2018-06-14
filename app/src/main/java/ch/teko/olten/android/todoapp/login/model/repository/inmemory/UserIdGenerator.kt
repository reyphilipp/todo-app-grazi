package ch.teko.olten.android.todoapp.login.model.repository.inmemory

object UserIdGenerator {

    var id = 1

    fun generateId() : Int {
        return id++
    }
}