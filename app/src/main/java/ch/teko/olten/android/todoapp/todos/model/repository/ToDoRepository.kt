package ch.teko.olten.android.todoapp.todos.model.repository

import ch.teko.olten.android.todoapp.todos.model.ToDo


interface ToDoRepository {

    fun getAllTodos() : List<ToDo>
    fun createToDo(title: String, todo: String)
    fun findToDo(id: Int): ToDo?
    fun updateToDo(toDo: ToDo)
    fun deleteToDo(id: Int)

    companion object {

        //private val repository = InMemoryToDoRepository()

        //fun getRepository() : ToDoRepository {
        //    return repository
        //}

    }

}