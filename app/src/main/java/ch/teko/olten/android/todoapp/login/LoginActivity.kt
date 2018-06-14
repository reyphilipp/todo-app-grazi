package ch.teko.olten.android.todoapp.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.todos.ToDosActivity
import ch.teko.olten.android.todoapp.login.model.AuthenticationService
import ch.teko.olten.android.todoapp.login.view.LoginView
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun userIsNotAllowed(username: String) {

    }

    override fun userIsAllowed(username: String) {

    }

}
