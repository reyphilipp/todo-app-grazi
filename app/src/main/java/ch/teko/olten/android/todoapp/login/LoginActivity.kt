package ch.teko.olten.android.todoapp.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.login.model.AuthenticationService
import ch.teko.olten.android.todoapp.login.view.LoginView
import ch.teko.olten.android.todoapp.todos.ToDosActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {

    val authenticationService = AuthenticationService(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        registerBtn.setOnClickListener {
            val registerIntent = Intent(this, RegisterActivity::class.java)
            startActivityForResult(registerIntent, Keys.REGISTER_REQUEST_CODE)
        }

        loginBtn.setOnClickListener {
            val username = usernameTxt.text.toString()
            val password = passwordTxt.text.toString()
            authenticationService.authenticate(username, password)
        }

    }

    override fun userIsNotAllowed(username: String) {
        usernameTxt.text = null
        passwordTxt.text = null
        Toast.makeText(this, "Sorry, Username $username not allowed!", Toast.LENGTH_SHORT).show()
    }

    override fun userIsAllowed(username: String) {
        val toDosIntent = Intent(this, ToDosActivity::class.java)
        startActivity(toDosIntent)
    }

}



















