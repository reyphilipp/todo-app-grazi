package ch.teko.olten.android.todoapp.todos.model.repository.rest

import ch.teko.olten.android.todoapp.todos.model.ToDo
import ch.teko.olten.android.todoapp.todos.model.repository.ToDoRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TodoRestRepository : ToDoRepository {

    private val todoApiService by lazy {
        TodoRestService.create()
    }

    override fun getAllTodos(): List<ToDo> {
        val todos = arrayListOf<ToDo>()
        todoApiService.getAllTodos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result ->
                            for (todo in result) {
                                todos.add(ToDo(todo.id, todo.title, todo.todo))
                            }
                            //eintraegeObserver.showEintraege(personen)
                        },
                        { error -> throw Exception(error.message) }
                )
        return todos
    }

    override fun createToDo(title: String, todo: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findToDo(id: Int): ToDo? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateToDo(toDo: ToDo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteToDo(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}