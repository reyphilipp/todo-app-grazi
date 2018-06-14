package ch.teko.olten.android.todoapp.todos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.todos.model.ToDo

class TodoAdapter(val context: Context, val todos:List<ToDo>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(context)
        val listenEintrag = layoutInflater.inflate(R.layout.to_do, parent, false)

        val idTxt = listenEintrag.findViewById<TextView>(R.id.idTxt)
        val titleTxt = listenEintrag.findViewById<TextView>(R.id.titleTxt)
        val todoTxt = listenEintrag.findViewById<TextView>(R.id.todoTxt)

        val todo = todos.get(position)

        idTxt.text = todo.id.toString()
        titleTxt.text = todo.title
        todoTxt.text = todo.todo

        return listenEintrag
    }

    override fun getItem(position: Int): Any {
        return todos.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return todos.size
    }
}