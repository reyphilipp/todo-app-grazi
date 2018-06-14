package ch.teko.olten.android.todoapp.todos.model

import ch.teko.olten.android.todoapp.todos.view.ToDoView

class ToDoService(private val view: ToDoView) {


    fun createToDo(title: String, todo: String) {

    }

    fun findToDo(id: Int) : ToDo? {
        return null
    }

    fun changeToDo(id: Int, title: String, toDoText: String) {

    }

    fun deleteToDo(id: Int) {

    }
}