package ch.teko.olten.android.todoapp.login

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ch.teko.olten.android.todoapp.R
import ch.teko.olten.android.todoapp.login.model.RegistryService
import ch.teko.olten.android.todoapp.login.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity(), RegisterView {

    val model = RegistryService(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerBtn.setOnClickListener {
            val username = usernameTxt.text.toString()
            val password = passwordTxt.text.toString()
            model.registerUser(username, password)
        }

    }

    override fun userIsRegistrated(username: String) {
        Toast.makeText(this, "User $username is now registrated!", Toast.LENGTH_SHORT).show()
        setResult(Activity.RESULT_OK)
        finish()
    }

    override fun userIsNotRegistrated(username: String) {
        usernameTxt.text = null
        passwordTxt.text = null
        Toast.makeText(this, "Sorry, User $username alredy exist!", Toast.LENGTH_SHORT).show()
    }

}
