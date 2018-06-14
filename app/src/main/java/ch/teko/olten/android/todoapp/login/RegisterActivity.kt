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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

    }

    override fun userIsRegistrated(username: String) {

    }

    override fun userIsNotRegistrated(username: String) {

    }

}
