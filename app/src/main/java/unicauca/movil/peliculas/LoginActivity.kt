package unicauca.movil.peliculas

import android.content.Context
import android.content.SharedPreferences
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity
import unicauca.movil.peliculas.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    val preferences: SharedPreferences by lazy {getSharedPreferences("preferencias",
            Context.MODE_PRIVATE)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val logged = preferences.getBoolean("logged",false)
        if (logged){
            startActivity<MainActivity>()
            finish()
            return
        }

        val binding:ActivityLoginBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_login)

        binding.handler = this
    }

    fun login(){
        preferences.edit().putBoolean("logged", true)
                .apply()
        startActivity<MainActivity>()
        finish()
    }

    fun register(){
        startActivity<RegisterActivity>()
        finish()

    }
}
