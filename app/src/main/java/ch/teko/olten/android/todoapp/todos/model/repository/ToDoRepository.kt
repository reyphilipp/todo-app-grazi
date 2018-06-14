package ch.teko.olten.android.todoapp.todos.model.repository

import ch.teko.olten.android.todoapp.login.model.repository.UserRepository
import ch.teko.olten.android.todoapp.login.model.repository.inmemory.InMemoryUserRepository
import ch.teko.olten.android.todoapp.todos.model.ToDo
import ch.teko.olten.android.todoapp.todos.model.repository.inmemory.InMemoryToDoRepository

interface ToDoRepository {

    fun getAllTodos() : List<ToDo>
    fun createToDo(title: String, todo: String)
    fun findToDo(id: Int): ToDo?
    fun updateToDo(toDo: ToDo)
    fun deleteToDo(id: Int)

    companion object {

        private val repository = InMemoryToDoRepository()

        fun getRepository() : ToDoRepository {
            return repository
        }

    }

}