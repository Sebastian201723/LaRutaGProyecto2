package unicauca.movil.peliculas
import android.content.Context
import android.content.SharedPreferences
import kotlinx.android.synthetic.main.activity_register.*
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.longToast

import org.jetbrains.anko.startActivity

import unicauca.movil.peliculas.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    val username = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val binding:ActivityRegisterBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_register)
        binding.handlerRegister = this

    }

    fun next(){
        longToast("Registrado Exitosamente")
        startActivity<MainActivity>()
        finish()
    }
}