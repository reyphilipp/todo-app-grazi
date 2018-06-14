package ch.teko.olten.android.todoapp.todos.model.repository.inmemory

import ch.teko.olten.android.todoapp.todos.model.ToDo
import ch.teko.olten.android.todoapp.todos.model.repository.ToDoRepository

class InMemoryToDoRepository : ToDoRepository {

    val toDos = arrayListOf<ToDo>()

    override fun getAllTodos(): List<ToDo> {
        return toDos
    }

    override fun createToDo(title: String, todo: String) {
        toDos.add(ToDo(ToDoIdGenerator.generateId(), title, todo))
    }

    override fun findToDo(id: Int): ToDo? {
        return toDos.find { toDo ->
            toDo.id.equals(id)
        }
    }

    override fun updateToDo(changedToDo: ToDo) {
        deleteToDo(changedToDo.id)
        toDos.add(changedToDo)
    }

    override fun deleteToDo(id: Int) {
        toDos.removeIf { toDo ->
            toDo.id.equals(id)
        }
    }
}