package ch.teko.olten.android.todoapp.todos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.todos.model.ToDosService
import kotlinx.android.synthetic.main.activity_to_dos.*

class ToDosActivity : AppCompatActivity() {

    val toDosService = ToDosService()
    val todoAdapter = TodoAdapter(this, toDosService.getAllToDos())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_dos)

        toDos.adapter = todoAdapter

        newToDoBtn.setOnClickListener {
            val newToDoIntent = Intent(this, NewToDoActivity::class.java)
            startActivityForResult(newToDoIntent, Keys.NEW_TODO_REQUEST_CODE)
        }

        toDos.setOnItemClickListener { parent, view, position, id ->
            val changeToDoIntent = Intent(this, ChangeToDoActivity::class.java)
            changeToDoIntent.putExtra(Keys.TODO_ID, toDosService.getAllToDos().get(position).id)
            startActivityForResult(changeToDoIntent, Keys.CHANGE_TODO_REQUEST_CODE)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        todoAdapter.notifyDataSetChanged()
    }
}
