package ch.teko.olten.android.todoapp.todos.model.repository.inmemory

import ch.teko.olten.android.todoapp.todos.model.ToDo
import ch.teko.olten.android.todoapp.todos.model.repository.ToDoRepository

class InMemoryToDoRepository : ToDoRepository {

    private val toDos = arrayListOf<ToDo>()

    override fun getAllTodos(): List<ToDo> {
        return toDos as List<ToDo>
    }

    override fun createToDo(title: String, todo: String) {
        toDos.add(ToDo(ToDoIdGenerator.generateId(), title, todo))
    }

    override fun findToDo(id: Int): ToDo? {
        return toDos.find {toDo ->
            toDo.id.equals(id)
        }
    }

    override fun updateToDo(toDo: ToDo) {
        val dbToDo = findToDo(toDo.id)
        if (dbToDo != null) {
            deleteToDo(toDo.id)
            toDos.add(toDo)
        }
    }

    override fun deleteToDo(id: Int) {
        toDos.removeIf{ toDo->
            toDo.id.equals(id)
        }
    }

}
