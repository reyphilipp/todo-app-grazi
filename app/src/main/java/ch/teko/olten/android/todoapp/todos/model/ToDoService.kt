package ch.teko.olten.android.todoapp.todos.model

import ch.teko.olten.android.todoapp.todos.model.repository.ToDoRepository
import ch.teko.olten.android.todoapp.todos.view.ToDoView

class ToDoService(private val view: ToDoView) {

    val repository = ToDoRepository.getRepository()

    fun createToDo(title: String, todo: String) {
        repository.createToDo(title, todo)
        view.modelChanged()
    }

    fun findToDo(id: Int) : ToDo? {
        return repository.findToDo(id)
    }

    fun changeToDo(id: Int, title: String, toDoText: String) {
        val changedToDo = ToDo(id, title, toDoText)
        repository.updateToDo(changedToDo)
        view.modelChanged()

    }

    fun deleteToDo(id: Int) {
        repository.deleteToDo(id)
        view.modelChanged()
    }
}