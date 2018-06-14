package ch.teko.olten.android.todoapp.todos

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.todos.view.ToDoView
import ch.teko.olten.android.todoapp.todos.model.ToDoService
import kotlinx.android.synthetic.main.activity_new_to_do.*

class NewToDoActivity : AppCompatActivity(), ToDoView {

    val toDoService = ToDoService(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_to_do)

        saveBtn.setOnClickListener {
            val title = titleTxt.text.toString()
            val todo = todoTxt.text.toString()

            toDoService.createToDo(title, todo)
        }

    }

    override fun modelChanged() {
        setResult(Activity.RESULT_OK)
        finish()
    }
}
