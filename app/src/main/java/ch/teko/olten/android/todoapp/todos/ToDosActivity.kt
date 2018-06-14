package ch.teko.olten.android.todoapp.todos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.todos.model.ToDosService

class ToDosActivity : AppCompatActivity() {

    val toDosService = ToDosService()
    val todoAdapter = TodoAdapter(this, toDosService.getAllToDos())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_dos)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

    }
}
