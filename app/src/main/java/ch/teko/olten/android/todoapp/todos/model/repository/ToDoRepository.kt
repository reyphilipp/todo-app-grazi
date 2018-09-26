package ch.teko.olten.android.todoapp.todos.model.repository

import ch.teko.olten.android.todoapp.todos.model.ToDo
import ch.teko.olten.android.todoapp.todos.model.repository.inmemory.InMemoryToDoRepository
import ch.teko.olten.android.todoapp.todos.model.repository.rest.TodoRestRepository
import ch.teko.olten.android.todoapp.todos.model.repository.rest.TodoRestService


interface ToDoRepository {

    fun getAllTodos() : List<ToDo>
    fun createToDo(title: String, todo: String)
    fun findToDo(id: Int): ToDo?
    fun updateToDo(toDo: ToDo)
    fun deleteToDo(id: Int)

    companion object {

        private val repository = TodoRestRepository()

        fun getRepository() : ToDoRepository {
            return repository
        }

    }

}