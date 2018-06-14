package ch.teko.olten.android.todoapp.todos

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.todos.model.ToDoService

import ch.teko.olten.android.todoapp.todos.view.ToDoView
import kotlinx.android.synthetic.main.activity_change_to_do.*

class ChangeToDoActivity : AppCompatActivity(), ToDoView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_to_do)
    }

    override fun modelChanged() {

    }
}
