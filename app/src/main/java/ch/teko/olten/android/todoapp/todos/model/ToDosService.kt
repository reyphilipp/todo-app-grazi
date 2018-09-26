package ch.teko.olten.android.todoapp.todos.model

import ch.teko.olten.android.todoapp.todos.model.repository.ToDoRepository

class ToDosService {

    val repository = ToDoRepository.getRepository()

    fun getAllToDos(): List<ToDo> {
        return repository.getAllTodos()
    }

}