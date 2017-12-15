package unicauca.movil.peliculas
import android.content.Context
import android.content.SharedPreferences
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import unicauca.movil.peliculas.databinding.ActivityLoginBinding
import unicauca.movil.peliculas.models.user
import unicauca.movil.peliculas.net.AppClient
import unicauca.movil.peliculas.util.Data

class LoginActivity : AppCompatActivity(), Callback<user> {

    var username=""
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
        username = email.toString()
        AppClient.usuarioApi.getByUsername(username).enqueue(this)
        //preferences.edit().putBoolean("logged", true)
        //        .apply()
        //longToast("¡Bienvenido a LaRutaG!")
        //startActivity<MainActivity>()
        //finish()
    }

    fun register(){
        longToast("Cargando..")
        startActivity<RegisterActivity>()
        finish()

    }

    override fun onResponse(call: Call<user>?, response: Response<user>) {
        if(response.isSuccessful){
            toast("¡Bienvenido " + username+"!")
            startActivity<MainActivity>()
            finish()
        }else{
            toast("User no existe")
        }
    }

    override fun onFailure(call: Call<user>?, t: Throwable?) {
        toast("¡Bienvenido " + username+"!")
        startActivity<MainActivity>()
        finish()

    }
}
