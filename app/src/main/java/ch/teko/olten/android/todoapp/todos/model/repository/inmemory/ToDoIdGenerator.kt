package ch.teko.olten.android.todoapp.todos.model.repository.inmemory

object ToDoIdGenerator {

    private var id = 1

    fun generateId() : Int {
        return id++
    }

}