package ch.teko.olten.android.todoapp.todos

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.todos.model.ToDoService

import ch.teko.olten.android.todoapp.todos.view.ToDoView
import kotlinx.android.synthetic.main.activity_change_to_do.*

class ChangeToDoActivity : AppCompatActivity(), ToDoView {

    val toDoService = ToDoService(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_to_do)

        val id = intent.getIntExtra(Keys.TODO_ID, -1)
        val toDo = toDoService.findToDo(id)

        if (toDo != null) {
            toDoId.setText(toDo.id.toString())
            titleTxt.setText(toDo.title)
            todoTxt.setText(toDo.todo)
        }

        saveBtn.setOnClickListener {
            val title = titleTxt.text.toString()
            val toDo = todoTxt.text.toString()
            toDoService.changeToDo(id, title, toDo)
        }

        deleteBtn.setOnClickListener {
            toDoService.deleteToDo(id)
        }


    }

    override fun modelChanged() {
        setResult(Activity.RESULT_OK)
        finish()
    }
}
